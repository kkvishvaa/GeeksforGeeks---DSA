public class RevInGrp {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            reverse(arr,left,right);
        }
    }
     public void reverse(int[] arr, int low ,int high){
         while(low<high){
             int temp=arr[low];
             arr[low]=arr[high];
             arr[high]=temp;
             low++;
             high--;
         }
     }
}

