import java.util.*; 
class Exactly3Divisors {
    public int exactly3Divisors(int n) {
        // code here
        int sqrt=(int)Math.sqrt(n);
        boolean[] isPrime=new boolean[sqrt+1];
        Arrays.fill(isPrime,true);
        int count=0;
        
        for(int i=2;i<=sqrt;i++){
            if(isPrime[i]){
            for(int j=i*i;j<=sqrt;j+=i){
                isPrime[j]=false;
            }
        }}
        
         for(int i=2;i<=sqrt;i++){
             if(isPrime[i]){
                 count++;
             }
         }
        return count;
    }
}
