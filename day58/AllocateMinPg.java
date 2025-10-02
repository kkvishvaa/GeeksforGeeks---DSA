public class AllocateMinPg {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n)
         return -1;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
          max=Math.max(max,arr[i]);
    }
    int low=max;
    int high=sum;
    int res=0;
    while(low<=high){
        int mid=(low+high)/2;
        if(isFeasible(arr,k,n,mid)){
            res=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return res;
    }
    public boolean isFeasible(int[] arr,int k,int n,int ans){
        int req=1;int sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
}

