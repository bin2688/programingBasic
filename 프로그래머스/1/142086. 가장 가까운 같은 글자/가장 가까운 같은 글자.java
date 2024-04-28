import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
    	// 문자열의 길이만큼 배열 객체 생성
        int[] answer = new int[s.length()];
        //해당 문자와 마지막으로 등장한 문자의 위치를 저장할 map생성
        Map<Character, Integer> map = new HashMap<>();      
        for (int i = 0; i < s.length(); i++) {  
        	//map에 포함되어있는 문자인지를 s길이만큼 반복하며 체크
            if (!map.containsKey(s.charAt(i))) {
            	//처음 등장한 문자라면 -1 저장
                answer[i] = -1;
                map.put(s.charAt(i), i);               
            } else {
                //이미 저장내역이 있다면, 현재위치에서 이전위치를 뺀 거리 저장
                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i), i);
            }
        }       
        return answer;
    }
}