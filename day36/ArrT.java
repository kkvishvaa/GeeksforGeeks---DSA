//space O(n) approach:
// public class ArrT {
//     public void arrange(long[] arr) {
//         int n=arr.length;
//         long[] arr2=new long[n];
//         for(int i=0;i<n;i++){
//             arr2[i]=arr[(int)arr[i]];
//         }
//         for(int i=0;i<n;i++){
//             arr[i]=arr2[i];
//         }
       
//     }
// }


//time O(n) and space O(1):
class Solution {
    public void arrange(long[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+(arr[(int)arr[i]]%n)*n;
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]/n;
        }
       
    }
}
