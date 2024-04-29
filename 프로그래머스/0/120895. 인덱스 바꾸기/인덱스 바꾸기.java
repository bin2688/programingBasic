class Solution {
    public String solution(String my_string, int num1, int num2) {
        //문자열을 char배열로 변환
		char[] arr = my_string.toCharArray();
        
		//num1과 num2 인덱스 값을 변경
	    arr[num1] = my_string.charAt(num2);
	    arr[num2] = my_string.charAt(num1);	  
        
	    //처리된 char배열을 문자열로 변환
	    String answer = String.valueOf(arr);
	    return answer;
    }
}