public class CountFreqBinSea {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int first=firstOccurrence(arr,n,target);
        int last=lastOccurrence(arr,n,target);
        if(first==-1 && last==-1){
            return 0;
        }
        int count=last-first+1;
        return count;
    }
    public int firstOccurrence(int [] arr,int n,int target){
        int low=0;
        int high=n-1;
       
        while(low<=high){
         int mid=(low+high)/2;
        if(arr[mid]>target){
            high=mid-1;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            if(mid==0 || arr[mid]!=arr[mid-1]){
                return mid;
            }
            else{
                high=mid-1;
            }
        }
        }
        return -1;
        
    }
        public int lastOccurrence(int [] arr,int n,int target){
        int low=0;
        int high=n-1;
       
        while(low<=high){
         int mid=(low+high)/2;
        if(arr[mid]>target){
            high=mid-1;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            if(mid==n-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }
            else{
                low=mid+1;
            }
        }
        }
        return -1;
        
    }
}


