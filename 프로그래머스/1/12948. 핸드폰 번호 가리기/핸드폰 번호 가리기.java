class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) { // 뒤 4자리 제외 아스테리스크 표시
                answer += "*"; 
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}