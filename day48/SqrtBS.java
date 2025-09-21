public class SqrtBS {
    int floorSqrt(int n) {
        // code here
        int low=0;
        int high=n;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int msqrt=mid*mid;
            if(msqrt==n){
                return mid;
            }
            else if(msqrt>n){
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}

