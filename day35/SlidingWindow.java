public class SlidingWindow {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int cur=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            cur+=arr[i];
        }
        int res=cur;
        for(int i=k;i<n;i++){
            cur=cur-arr[i-k]+arr[i];
            res=Math.max(res,cur);
        }
        return res;
    }
}
//solving current subarray using previous subarray is sliding window technique