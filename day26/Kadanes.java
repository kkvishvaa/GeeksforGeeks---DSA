// to find the maximum sum of a subarray

public class Kadanes {
    int maxSubarraySum(int[] arr) {
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

