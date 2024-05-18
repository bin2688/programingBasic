import java.util.*;
class Solution {
    public String solution(String s) {
        ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i) + "");
		}
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
		Iterator<String> it =  set.iterator();
		String answer = "";
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < set.size(); i++) {
			String s2 = it.next();
			int f = Collections.frequency(list, s2);
			if (f == 1) {
				result.add(s2);
			}
		}
		Collections.sort(result);
		answer = String.join("", result);
		return answer;
    }
}