import java.util.ArrayList;
import java.util.Arrays;

public class SmallestPositiveNo {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
              if(i==n-1 || arr[i+1]!=arr[i]){
                list.add(arr[i]);
            }
            }
          
        }
        int res=0;
        for(int i=1;i<=list.size();i++){
            if(i!=list.get(i-1)){
                return i;
            }
        }
        int ln=list.size();
        return list.size()+1;
    }
}


