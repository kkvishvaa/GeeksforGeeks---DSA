public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int res=-1;
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                res=largest;
                largest=arr[i];
            }
          else if(arr[i]!=largest){
           if(res==-1 || arr[i]>res){
               res=arr[i];
           }}
        }
        return res;
    }
} 
    

