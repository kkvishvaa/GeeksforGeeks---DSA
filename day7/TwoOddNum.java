import java.util.ArrayList;

public class TwoOddNum {
    ArrayList<Integer> twoOddNum(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        // code here
        int x=arr[0];
        for(int i=1;i<arr.length;i++){
            x=x^arr[i];
        }
        int k=(x&(~(x-1)));
        int res1=0;
        int res2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&k)!=0){
                res1=res1^arr[i];
            }
            else{
                res2=res2^arr[i];
            }
            
        }
        if(res1>res2){
            list.add(res1);
            list.add(res2);
        }
        else{
            list.add(res2);
            list.add(res1);
        }
        return list;
        
    }
}
 {
    
}
