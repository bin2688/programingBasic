class Solution {
    public int[] solution(int[] num_list) {
      int[] answer = new int[num_list.length];
		int j = num_list.length - 1;
		for (int x : num_list) {
			answer[j--] = x;
		}
		return answer;
    }
}