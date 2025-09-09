package day37;

public class AdjDiffCirArr {

    // Function to find minimum adjacent difference in a circular array.
    //  arr[]: input array
    //  n: size of array
    public static int minAdjDiff(int arr[], int n) {

        // Your code here
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            res=Math.min(res,Math.abs(arr[i]-arr[i+1]));
        }
        res=Math.min(res,Math.abs(arr[n-1]-arr[0]));
        return res;
    }
}


