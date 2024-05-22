class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        String k2 = String.valueOf(k);
        int index = s.indexOf(k2);
        int answer = -1;
        if (s.contains(k2)) {
			answer = index + 1;
		}
        return answer;
    }
}