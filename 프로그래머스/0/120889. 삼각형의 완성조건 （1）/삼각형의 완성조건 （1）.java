import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides); //정렬 후 가장 큰수 찾기
       
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1; //큰 변의 수가 나머지보다 작을 때 1
        } else {
            answer = 2; //큰 변의 수가 나머지보다 같거나 클 때 1
        }
        return answer;
    }
}