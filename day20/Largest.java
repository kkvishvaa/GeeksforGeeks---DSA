public class Largest {
    public static int largest(int[] arr){
      int res=0;
      for(int i=0;i<arr.length;i++){
        //cur=Math.max(cur,arr[i]);
        if(arr[i]>arr[res])
           res=i;
      }
       return arr[res];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(largest(arr));
    }
}
 //TC:theta(n)