class Solution {
    public int solution(int number, int limit, int power) {
       int answer = 0;
       int[] divisorCnt = new int[number + 1];  //인덱스는 0부터 시작이므로 +1         
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                //약수의 개수 계산
                divisorCnt[i * j]++;
            }
        }               
        for (int i = 1; i <= number; i++) {
            //제한수치를 초과하면 power 입력, 아니라면 약수의개수 입력
            if (divisorCnt[i] > limit) {
                answer += power;
            } else {
                answer += divisorCnt[i];
            }
        }
        return answer;
    }
}