public class MaxConsOnes {
    public static int max1s(int[] arr){
        int n=arr.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]==0){
            count=0;
           }
           else{
            count+=1;
            res=Math.max(res,count);
           }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,1,1,1,1,1,1};
        System.out.println(max1s(arr));
    }
}
