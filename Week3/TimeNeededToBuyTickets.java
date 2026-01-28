public class TimeNeededToBuyTickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        int n=tickets.length;
        for(int i=0;i<n;i++){
            if(i<=k){
                time=time+Math.min(tickets[i],tickets[k]);
            }
            else{
                time=time+Math.min(tickets[i],tickets[k]-1);
            }
        }
        return time;
    }
    public static void main(String[] args) {
        int[] tickets={2,3,2};
        int k=2;
        int result=timeRequiredToBuy(tickets, k);
        System.out.println(result);
    }
}
