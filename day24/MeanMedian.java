import java.util.Arrays;

public class MeanMedian {
    public int mean(int[] arr) {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           
        }
         return sum/arr.length;
    }

    public int median(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        // code here
        if(n%2!=0){
            return arr[n/2];
        }
        else{
            return (arr[n/2-1]+arr[n/2])/2;
        }
    }
    
}

