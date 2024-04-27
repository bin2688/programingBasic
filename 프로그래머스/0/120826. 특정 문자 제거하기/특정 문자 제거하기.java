class Solution {
    public String solution(String my_string, String letter) {        
         //특정 문자 대체함수 사용
        String answer = my_string.replace(letter, ""); 
        
        return answer;
    }
}