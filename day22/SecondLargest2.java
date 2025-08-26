import java.util.ArrayList;

public class SecondLargest2 {

    public static ArrayList<Integer> largestAndSecondLargest(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int res=-1;
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                res=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest)
            {
                if(res==-1 || arr[i]>res){
                    res=arr[i];
                }
            }
        }
        list.add(largest);
        list.add(res);
        return list;
    }
}
