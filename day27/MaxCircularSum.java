public class MaxCircularSum {
    public int maxCircularSum(int arr[]) {
     int n=arr.length;
     int  maxNormal=maxNormalSum(arr);
     if(maxNormal<0)
       return maxNormal;
    int arrsum=0;
 
    for(int i=0;i<n;i++){
         arrsum+=arr[i];
         arr[i]=-arr[i];    
     }
     int maxCircular=arrsum+maxNormalSum(arr);
     return Math.max(maxNormal,maxCircular);
    }
    public int maxNormalSum(int arr[]){
        int n=arr.length;
        int maxEnding=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(res,maxEnding);
        }
        return res;
    }
}

