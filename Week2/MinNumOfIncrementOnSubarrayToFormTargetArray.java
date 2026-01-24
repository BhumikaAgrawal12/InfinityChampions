public class MinNumOfIncrementOnSubarrayToFormTargetArray {
    public int minNumberOperations(int[] target) {
        int n=target.length;
        int itr=target[0];
        for(int i=1;i<n;i++){
            if(target[i]>target[i-1]){
                itr=itr+(target[i]-target[i-1]);
            }
        }
        return itr;
    }
    public void main(String[] args) {
        int[] target={1,2,3,2,1};
        System.out.println(minNumberOperations(target));
    }
}
