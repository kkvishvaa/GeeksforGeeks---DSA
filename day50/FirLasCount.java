import java.util.Arrays;

public class FirLasCount {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int ans=0;
        int i=0;
        while(i<n){
        int last=lastIndex(arr,n,arr[i]);
        int first=firstIndex(arr,n,arr[i]);
        count=last-first+1;
        if(count>n/k){
            ans++;
        }
        i=last+1;
        }
        return ans;
        
    }
    public int firstIndex(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
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
    
    public int lastIndex(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x){
                high=mid-1;
            }
            else if(arr[mid]<x){
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
// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(1)
