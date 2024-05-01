import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
            //clone으로 answer배열 초기화
		 	String[] answer =  players.clone();

	        //for문으로 선수이름과 부르는 이름을 일일이 비교하기엔 N제곱만큼의 시간이 소모될거라 예상
	        //hashmap사용
	        HashMap<String, Integer> map = new HashMap();
	        
	        //선수와 등수를 저장
	        for (int i = 0; i < players.length; i++) {
				map.put(players[i], i);
			}
	        	        
	        for (String player : callings) {
	        	//호명된 선수의 value(등수)추출
	        	int number = map.get(player);
	        	//호명된 선수 바로 앞 선수를 추출
	        	String front = answer[number-1];
                
                //두 선수의 위치를 교환
                answer[number - 1] = player;
                answer[number] = front;
	        	
	        	//해당값 map에 업데이트
	        	map.put(player, number - 1);
	            map.put(front, number);
	        	
			}	        
	        	        
	        return answer;
    }
}