class Solution {
    public boolean solution(String s) {
		char[] c = s.toCharArray();
		boolean answer = true;
		if(s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < c.length; i++) {
				if(c[i] < '0' || c[i] > '9') {
					answer = false;
				}
			}
		}else {
			return answer = false;
		}
		return answer;
    } 
}