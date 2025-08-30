public class EveOddLen {
    public static int maxEvenOdd(int arr[]) {
        //  code here
        int n=arr.length;
        int res=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 ||arr[i]%2!=0 && arr[i-1]%2==0 ){
                count++;
                res=Math.max(res,count);
            }
            else{
                count=1;
            }
        }
        return res;
    }
}

