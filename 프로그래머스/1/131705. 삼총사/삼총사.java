class Solution {
    public int solution(int[] number) {
       int answer = 0;      
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    //인덱스 3개의 더한 값이 0이 되는 경우의 수를 모두 카운트
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;    
    }
}