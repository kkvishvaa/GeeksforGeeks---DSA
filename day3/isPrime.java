// class isPrime {
//     public boolean isPrimeNo(int n) {
//         // code here
//         if(n==1)
//         {
//             return false;
//         }
//         else{
//             for(int i=2;i*i<=n;i++)
//             {
//                 if(n%i==0)
//                    return false;
//                }
//              return true;
//         }
//     }
// }



//most efficient code:
class Solution {
    public boolean isPrime(int n) {
        // code here
        if(n==1)
            return false;
        if(n==2||n==3)    //this saves a lot of iterations 
            return true;
        if(n%2==0 || n%3==0)
            return false;
        
            for(int i=5;i*i<=n;i+=6)
            {
                if(n%i==0||n%(i+2)==0)
                   return false;
            }
             return true;
    }
}