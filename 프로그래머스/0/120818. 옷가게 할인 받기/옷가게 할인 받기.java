class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price >= 500000){
           answer = price * (100-20)/100;
        } else if(price >= 300000){
           answer = price * (100-10)/100;
        } else if(price >= 100000){
           answer = price * (100-5)/100;
        } else {
            return price;
        }
        return answer;
    }
}