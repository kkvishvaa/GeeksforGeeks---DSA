public class MaxStep {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(i+1<n && arr[i+1]>arr[i]){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
}

