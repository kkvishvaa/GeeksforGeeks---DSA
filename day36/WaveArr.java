public class WaveArr {
    public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            if(i>0 && arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            if(i<n-1 && arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
}


