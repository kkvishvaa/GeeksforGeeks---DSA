//Sieve of Eratosthenes
import java.util.*;
public class Sieve {
    static void sieve(int n){
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,true);
        
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
                for(int j=i*i;j<=n;j+=i){
                   isPrime[j]=false;
                }            }
        }
    }
    public static void main(String[] args) {
        sieve(20);
    }
}

//Time Complexity: O(n*log(log(n)))
//Auxiliary Space: O(n)


// class Solution {
//     public int[] sieve(int n) {
//         // code here
     
//         ArrayList<Integer> list=new ArrayList<>();
//         boolean[] isPrime=new boolean[n+1];
//         Arrays.fill(isPrime,true);
        
//         for(int i=2;i<=n;i++){
//             if(isPrime[i]){
//                 list.add(i);
//                 for(int j=i*i;j<=n;j+=i){
//                    isPrime[j]=false;
//                 }}
//         }
//         int[] result=new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             result[i]=list.get(i);
//         }
//     return result;
//     }
// }
