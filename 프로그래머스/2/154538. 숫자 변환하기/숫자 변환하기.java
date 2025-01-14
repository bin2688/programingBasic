import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if(x == y) 
            return 0;
        int[] cnt = new int[1000001];
        Arrays.fill(cnt, -1);
        cnt[x] = 0;
        for(int i=x; i<=y; i++){
            if(cnt[i] == -1)
                continue;
            int nc = cnt[i]+1;
            if(i+n <= y)
                cnt[i+n] = cnt[i+n] == -1 ? nc : Math.min(cnt[i+n], nc);
            if(i*2 <= y)
                cnt[i*2] = cnt[i*2] == -1 ? nc : Math.min(cnt[i*2], nc);
            if(i*3 <= y)
                cnt[i*3] = cnt[i*3] == -1 ? nc : Math.min(cnt[i*3], nc);
        }
        
        return cnt[y];
    }
}