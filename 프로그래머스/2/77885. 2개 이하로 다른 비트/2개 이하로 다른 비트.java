class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                answer[i] = numbers[i] + 1;
                continue;
            }

            String n = Long.toString(numbers[i], 2);

            if(!n.contains("0")) {
                String temp = n.substring(0, 1) + "0" + n.substring(1);
                answer[i] = Long.parseLong(temp, 2);
            } else {
                int idx = n.lastIndexOf("0");
                n = n.substring(0, idx) + "10" + n.substring(idx + 2);
                answer[i] = Long.parseLong(n, 2);
            }
        }
        return answer;
    }
}