class Solution {
    public int solution(int[] numbers) {
		 	//0부터 9까지를 더한 값을 저장
	        int answer = 45;
	        int sum = 0;
	        //이미 존재하는 수를 모두 더한 값 저장
	        for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
	        //전체값에서 존재하는 값을 빼고,남은 값 리턴
	        return answer - sum;
	    }
}