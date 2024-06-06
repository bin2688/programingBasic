class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //참이면 더하고 아니면 빼기
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        
        return answer;
    }
}