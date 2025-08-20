public class SubsetSum {
    public static int subset(int arr[], int n, int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return subset(arr,n-1,sum)+subset(arr,n-1,sum-arr[n-1]);
    }
  public static void main(String[] args) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = arr.length;
        System.out.println("No.of subsets:"+subset(arr,n,sum));
    }
}

//TC:theta(2^n)