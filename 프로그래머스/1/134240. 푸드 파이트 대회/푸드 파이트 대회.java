class Solution {
    public String solution(int[] food) {
        //물 초기값 저장
        String answer = "0";
        //칼로리가 적은순서부터 적어야하기에 역순으로 반복
        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                //물 양쪽에 음식값 추가
                answer = i + answer + i; 
            }
        }
        return answer;
    }
}