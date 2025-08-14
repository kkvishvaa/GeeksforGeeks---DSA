public class Armstrong {
    static boolean armstrongNumber(int n) {
        // code here
        int digits=(int)Math.log10(n)+1;
        int x=n;
        int sum=0;
        int temp;
        for(int i=0;i<digits;i++){
            temp=x%10;
            sum+=Math.pow(temp,3);
            x=x/10;
            
        }
         if(sum==n){
             return true;
         };
         return false;
    }
}
    

