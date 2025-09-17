public class BinaryRec {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        return binarysearchR(arr,0,n-1,k);
    }
    public int binarysearchR(int[] arr,int low,int high,int k) {
        if(low>high)
         return -1;
        int mid=(low+high)/2;
        if(arr[mid]==k){
            int left=binarysearchR(arr,low,mid-1,k);
            return left!=-1?left:mid;
        }
        else if(arr[mid]>k){
            return binarysearchR(arr,low,mid-1,k);
        }
        else{
            return binarysearchR(arr,mid+1,high,k);
        }
    }
}

