class Solution {
    public int solution(int[] box, int n) {
        //도형의 넓이 공식에 주사위 모서리 길이만큼 각각 나누기
        int answer = (box[0]/n)*(box[1]/n)*(box[2]/n);	
        return answer;
    }
}