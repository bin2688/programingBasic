class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");        
        int idx = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){ //띄어쓰기 인덱스 초기화
                idx = 0; 
            }
            else if(idx % 2 == 0){ //인덱스 짝수
                str[i] = str[i].toUpperCase(); //대문자
                idx++; 
            }
            else if(idx % 2 != 0){ //인덱스 홀수
                str[i] = str[i].toLowerCase(); //소문자
                idx++; 
            }
            answer += str[i];
        }
        return answer;
    }
}