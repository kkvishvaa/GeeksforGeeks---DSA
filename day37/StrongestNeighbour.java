package day37;

import java.util.ArrayList;

public class StrongestNeighbour {

    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
      ArrayList<Integer> list=new ArrayList<Integer>();    
      int n=arr.length;
      for(int i=0;i<n-1;i++){
         list.add(Math.max(arr[i],arr[i+1]));
      }
      return list;
    }
};

