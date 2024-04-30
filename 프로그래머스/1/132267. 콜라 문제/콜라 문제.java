class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
        //가지고 있는 빈병 수가 제출할 수 있는 빈병 수보다 작을 때까지 반복
        while (n>=a) {  
        	//(제출한 횟수)*(받을 수 있는 콜라 수)로 받는 콜라 수 누적계산
            answer += (n/a)*b;
            //전체 빈병수는 제출할 수 있는 수로 나누어지지 않는 몫도 포함
    		n = ((n/a)*b) + (n%a);
		}
        //제출하고 받은 총 콜라병의 수 리턴
        return answer;
    }
}