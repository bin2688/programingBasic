import java.util.*;
class Solution {
    public String solution(String s) {
	char[] c = s.toCharArray();
	Arrays.sort(c);
	String x = new String(c);

	String answer = new StringBuilder(x).reverse().toString();
	return answer;
    }
}