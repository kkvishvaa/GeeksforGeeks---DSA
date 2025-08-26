public class Largest {
    public static int largest(int[] arr) {
        // code here
        int res=0;
        for(int i=0;i<arr.length;i++)
        if(arr[i]>res){
            res=arr[i];
        }
        return res;
    }
}

