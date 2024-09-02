import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<order.length;i++){
            s.push(i+1);
            while(!s.isEmpty()){
                if(s.peek()==order[answer]){
                    s.pop();
                    answer++;
                }
                else break;   
            }  
        }
        
        return answer;
    }
}