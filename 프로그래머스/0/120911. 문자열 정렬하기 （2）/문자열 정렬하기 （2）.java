import java.util.*;
class Solution {
    public String solution(String my_string) {
        String s = my_string.toLowerCase();
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String answer = "";
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i];
		}
        return answer;
    }
}