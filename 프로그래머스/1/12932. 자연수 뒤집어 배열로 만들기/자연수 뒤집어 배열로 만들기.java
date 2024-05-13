import java.util.*;
class Solution {
    public int[] solution(long n) {
        String s = n + "";
		String[] s2 = s.split("");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s2.length; i++) {
			stack.push(s2[i]);
		}		
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(stack.pop());
		}
		return answer;
    }
}