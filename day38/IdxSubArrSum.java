import java.util.ArrayList;

public class IdxSubArrSum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int s=0;
        int cur=0;
        for(int i=0;i<n;i++){
            cur+=arr[i];
            while(cur>target){
                cur-=arr[s];
                s++;
            }
            if(cur==target){
            list.add(s+1);
            list.add(i+1);
            return list;
            }
        }
        list.add(-1);
        return list;
    }
}


