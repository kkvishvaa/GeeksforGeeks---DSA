import java.util.ArrayList;

public class PrefixSum {
     
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> list=new ArrayList<> ();
        int n=arr.length;
         int[] parr=new int[n];
        parr[0]=arr[0];
        for(int i=1;i<n;i++){
            parr[i]=arr[i]+parr[i-1];
        }
        for(int[] q:queries){
            int left=q[0];
            int right=q[1];
        list.add(getSum(parr,left,right));
        
    }
    return list;
    }
    public int getSum(int[] parr,int left,int right){
        if(left==0){
            return parr[right];
        }
        return parr[right]-parr[left-1];
    }
    
}

