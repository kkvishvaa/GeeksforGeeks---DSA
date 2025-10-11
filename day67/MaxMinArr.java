import java.util.ArrayList;

public class MaxMinArr {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int maximum=arr[0];
        int minimum=arr[0];
        for(int i=1;i<n;i++){
          if(arr[i]<minimum){
              minimum=arr[i];
          }
          if(arr[i]>maximum){
              maximum=arr[i];
          }
    }
    list.add(minimum);
    list.add(maximum);
    return list;
    }
}


