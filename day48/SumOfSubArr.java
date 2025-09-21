public class SumOfSubArr {
    public int subarraySum(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]*(i+1)*(n-i);
        }
        return sum;
    }
}

//Total sum = Σ (arr[i] * (i+1) * (n-i))
//Subarrays containing 3: [3], [2,3], [1,2,3] → element 3 appears in 3 subarrays → contribution = 3+3+3 = 9 done for each element