// import java.util.Arrays;
// public class Count1sBinSea {
//     public int countOnes(int[] arr) {
//         // code here
//         Arrays.sort(arr);
//         int n=arr.length;
//         int low=0;
//         int high=n-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]==0){
//                 low=mid+1;
//             }
//             else{
//                 if(mid==0 || arr[mid-1]==0){
//                 return n-mid;
//                 }
//                 else
//                 high=mid-1;
//             }
//         }
//         return 0;
//     }
// }

class Count1sBinSea {
    public int countOnes(int[] arr) {
        // code here
     
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                high=mid-1;
            }
            else{
                if(mid==n-1 || arr[mid+1]==0){
                return mid+1;
                }
                else
                low=mid+1;
            }
        }
        return 0;
    }
}