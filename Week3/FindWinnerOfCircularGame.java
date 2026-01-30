import java.util.LinkedList;
import java.util.Queue;

public class FindWinnerOfCircularGame {
     public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        int i=1;
        while(q.size()!=1){
            int val=q.poll();
            if(i==k){
                i=0;
            }
            else{
                q.add(val);
            }
            i++;
        }
        return q.poll();
    }
    public static void main(String[] args) {
        FindWinnerOfCircularGame game = new FindWinnerOfCircularGame();
        int n = 5;
        int k = 2;
        int winner = game.findTheWinner(n, k);
        System.out.println("The winner is: " + winner);
    }
}
