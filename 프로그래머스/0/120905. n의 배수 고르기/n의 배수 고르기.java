import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
     	ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : numlist) {
			if (x%n == 0) {
				list.add(x);
			}
		}		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}