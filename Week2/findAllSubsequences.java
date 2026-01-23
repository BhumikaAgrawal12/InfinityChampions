
//leetcode 2030(Smallest K-Length Subsequence With Occurrences of a Letter)
import java.util.*;
public class findAllSubsequences {
    static String best = null;
    public static void findSubsequences(String str,String ans,int indx,int k,char letter,int repitions){
        if (ans.length() > k) return;
        if(ans.length()==k){   
            int count = 0;
            for (int i = 0; i < ans.length(); i++) {
                if (ans.charAt(i) == letter) {
                    count++;
                }
            }

            if (count < repitions) return;
            if (best == null || ans.compareTo(best) < 0) {//lexicogaphically comparision k liye
                best = ans;
            }
            //System.out.println(ans);
            return;
           
        }
        if(indx==str.length()){
            return;
        }
        //include
        findSubsequences(str,ans+str.charAt(indx),indx+1,k,letter,repitions);
        //exclude
        findSubsequences(str,ans,indx+1,k,letter,repitions);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello enter the string and k value:");
        String str=sc.nextLine();
        int k=sc.nextInt();
        char letter='e';
        int repitions=1;
        best=null;//reset static variable best for multiple test cases
        findSubsequences(str,"",0,k,letter,repitions);
        if(best!=null){
            System.out.println(best);
        }
        else
        {
            System.out.println("NO VALID SUBSEQUENCE");
        }
        sc.close();
    }
}

//optimised solution using monotonic stack+greedy approach


// class Solution {
//     public String smallestSubsequence(String s, int k, char letter, int repetition) {
//         int letterCount=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==letter){
//                 letterCount++;
//             }
//         }
//         int remainLetter=letterCount;
//         int st_letter=0;
//         ArrayDeque<Character>st=new ArrayDeque<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch==letter){
//                 remainLetter--;
//             }
//              while (!st.isEmpty()
//                     && st.peek() > ch
//                     && st.size() - 1 + (s.length() - i) >= k
//                     && (st.peek() != letter || st_letter - 1 + remainLetter >= repetition)) {

//                 if (st.pop() == letter) st_letter--;
//             }

//             if(st.size()<k && ch==letter){
//                 st_letter++;
//                 st.push(ch);
//             }
//             else if(st.size()<k){
//                 if(k-st.size()>repetition-st_letter){
//                     st.push(ch);
//                 }
//             }

//         }
//         StringBuilder sb=new StringBuilder();
//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }
//         return sb.reverse().toString();
//     }
// }


