public class LongestConsc1s {
    
    public static int maxConsecutiveOnes(int n) {
        // code here
        int maxCount=0;
        int currentCount=0;
        while(n>0){
            if((n&1)==1){
                currentCount+=1;
                maxCount=Math.max(maxCount,currentCount);
               
            }
            else{
                currentCount=0;
            }
             n=n>>1;
        }
        return maxCount;
    }
}


