class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0; //소수점 출력
        
        for(int x : arr) {
            sum += x;
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
}