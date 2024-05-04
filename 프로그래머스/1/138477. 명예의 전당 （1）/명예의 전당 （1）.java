import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            //list크기가 k보다작다면 점수추가
            if(list.size() < k) {
                list.add(score[i]);
            } else {
                //list의 가장 작은 점수보다 크다면 점수 대체
                if(list.get(0) < score[i]) {
                    list.set(0, score[i]);
                }
            }
            //최소값순으로 정렬
            Collections.sort(list);
            //최소값 배열에 할당
            answer[i] = list.get(0);
        }
        return answer;
    }
}