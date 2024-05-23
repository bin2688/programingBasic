class Solution {
    public int solution(int n) {
        String s = String.valueOf(n);
        String[] s2 = s.split("");
        int answer = 0;
		for (int i = 0; i < s2.length; i++) {
			int x = Integer.parseInt(s2[i]);
			answer = answer + x;
		}
        return answer;
    }
}