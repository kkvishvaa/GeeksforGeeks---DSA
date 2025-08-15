//A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
public class Sparse{
    public static boolean isSparse(int n) {
        // code here
       if(consecutive(n)==1){
           return true ;
       }
       return false;
       
        
    }
    
    public static int consecutive(int n){
        int count=0;
        int maxCount=0;
        while(n>0){
            if((n&1)==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }
            else{
                count=0;
            }
            n=n>>1;
        }
        return maxCount;
    }
}

//or
// class Solution {
//     public static boolean isSparse(int n) {
//         // code here
//         return (n&(n>>1))==0;  //binary to gray trick ,if 0 then sparse 
//     }
// }

