class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<n; i++){
            if(n % i == 1){
                answer = i; 
                //모든 경우를 나눠야함
                break;
            }
        }
        return answer;
    }
}