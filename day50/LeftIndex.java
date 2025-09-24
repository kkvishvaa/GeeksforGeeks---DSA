//index of first occurrence of the target value in the sorted
public class LeftIndex {
    public int leftIndex(int[] arr, int x) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<x){
                low=mid+1;
            }
            else if(arr[mid]>x){
                high=mid-1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid])
                  return mid;
                else
                  high=mid-1;
            }
        }
        return -1;
    }
}

// Time Complexity: O(log n)
// Space Complexity: O(1)