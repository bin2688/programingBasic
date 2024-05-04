class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";       
        int idx1 = 0;
        int idx2 = 0;        
        int idxGoal = 0;
        
        //goal배열에 card1 또는 card2에 일치하는 문자열이 있다면 인덱스 증가
        while(idxGoal < goal.length) {
        	if (idx1 < cards1.length && goal[idxGoal].equals(cards1[idx1])) {
        		idx1++;
        	} else if (idx2 < cards2.length && goal[idxGoal].equals(cards2[idx2])) {
        		idx2++;
        	} else {
                //해당 인덱스 차례에 일치하는 문자열이 없다면 no리턴
        		answer = "No";
        		break;
        	}
        	idxGoal++;
        }        
        return answer;
    }
}