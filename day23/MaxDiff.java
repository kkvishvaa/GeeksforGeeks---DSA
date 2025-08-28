public class MaxDiff {
    int maxIndexDiff(int[] arr) {
        // code here
        int res=arr[1]-arr[0];
        int minValue=arr[0];
        for(int j=1;j<arr.length;j++){
            res=Math.max(res,arr[j]-minValue);
            minValue=Math.min(minValue,arr[j]);
        }
        return res;
    }
}

//time complexity-theta(n),space complexity-theta(1)