import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
	ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		int before = arr[0];
		for (int i = 0; i <  arr.length; i++) {
			if (arr[i] != before) {
				list.add(arr[i]);
				before = arr[i];
			}
		}		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
    }
}