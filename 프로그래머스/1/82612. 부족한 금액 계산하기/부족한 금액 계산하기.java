class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        //total에 가격 누적
        long total = 0;
        for(int i=1; i<count+1; i++){
            total += price * i;
        }
        
        //부족한 금액
        if(money < total)
            answer = total - money;
        //부족하지 않을 경우
        else
            answer = 0;
        
        return answer;
    }
}