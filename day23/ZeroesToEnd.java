public class ZeroesToEnd {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
//Arrays.toString(arr) -to display all your array elements
