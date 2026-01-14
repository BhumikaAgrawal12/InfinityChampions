package Week1;
//445 leetcode(Assign cookies)
import java.util.*;

public class Solution2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                cnt++;
                i++;
                j++;
            }
            else{
                j++;
            }

            
        }
        return cnt;
    }
    public void main(String args[]){
        int[] g={1,2,3};
        int[] s={1,1};
        int ans=findContentChildren(g,s);
        System.out.println(ans);
    }
}
