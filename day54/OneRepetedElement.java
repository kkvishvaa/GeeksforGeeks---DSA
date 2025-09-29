import java.util.ArrayList;
public class OneRepetedElement {
    public ArrayList<Integer> findRepeating(int[] arr) {
        // code here
         ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int low=0;
        int high=n-1;
        int duplicate=-1;
        if(n<=1){
            list.add(-1);
            list.add(-1);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int expected=arr[0]+mid;      //adjacent difference is 1 : arr[i]-i=arr[0] => arr[i]=arr[0]+i
            if(expected==arr[mid]){
                low=mid+1;
            }
            else{
                duplicate=arr[mid];
                high=mid-1;
            }
        }
        if(duplicate==-1){
            list.add(-1);
            list.add(-1);
            return list;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==duplicate){
                count++;
            }
        }
        list.add(duplicate);
        list.add(count);
        return list;
    }
}


//Repeated element vid was for numbers with values 0 to n-1 in n arr 