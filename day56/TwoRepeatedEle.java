import java.util.ArrayList;
import java.util.Arrays;

public class TwoRepeatedEle {

    public int[] twoRepeated(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        boolean[] visit=new boolean[n];
        Arrays.fill(visit,false);
        for(int i=0;i<n;i++){
            if(visit[arr[i]])
             list.add(arr[i]);
            else
              visit[arr[i]]=true;
        }
        int[] result=new int[2];
        result[0]=list.get(0);
        result[1]=list.get(1);
        return result;
    }
}
// time complexity: O(n)
// space complexity: O(n)
