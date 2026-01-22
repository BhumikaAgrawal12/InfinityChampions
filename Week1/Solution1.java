
import java.util.*;
//Distribute Candies at leetcode
public class Solution1 {
    public  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] candies=new int[n];
        for(int i=0;i<n;i++){
            candies[i]=sc.nextInt();
        }
        int ans=distributeCandies(candies);
        System.out.println(ans);
    }
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int hlf=n/2;
        return Math.min(hlf,set.size());
    }
}
