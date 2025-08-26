import java.util.ArrayList;

public class RemDuplicates {

    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
   
             list.add(arr[0]);
        for(int res=1;res<arr.length;res++){
            if(arr[res-1]!=arr[res]){
                list.add(arr[res]);
            }
        }
        return list;
        
    }
}


