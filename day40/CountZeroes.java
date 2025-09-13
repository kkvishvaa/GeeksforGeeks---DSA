public class CountZeroes {
    int countZeroes(int[] arr) {
        // code here
        int count=0;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}

