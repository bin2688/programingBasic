import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
         int[] answer = new int[photo.length];
         
        HashMap<String,Integer> map = new HashMap<>();
        //그리운 인물과 점수 저장
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]); 
        }

        for(int i=0; i< photo.length; i++){
            String[] persons = photo[i]; //사진별 그리운 인물 배열 생성
            int score = 0; //총 점수 변수초기화
            
            for(int j=0; j<persons.length; j++){ 
                //인물 일치하면 해당 점수 저장
                if(map.containsKey(persons[j])){ 
                    score += map.get(persons[j]);
                }
            }
            //총점수 배열 인덱스에 저장
            answer[i] = score;
        }
        return answer;
    }
}