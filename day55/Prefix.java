import java.util.ArrayList;

public class Prefix {

    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        list.add(arr[0]);
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
            list.add(arr[i]);
        }
        return list;
    }
}

