public class Divisors {
    static void printDivisors(int n)
    {
        int i;
        for(i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }}i--;
        for( ;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
        }
            }
        
    }
public static void main(String[] args) {
    printDivisors(20);
}
}


// class Solution {
//     public static void print_divisors(int n) {
       
//         if(n==1){
//         System.out.print("1");
//         return ;
//         }
//          int i;
//         for(i=1;i*i<=n;i++){
//             if(n%i==0){
//                 System.out.print(i+" ");
//             }}i--;
//         for( ;i>=1;i--){
//             if(n%i==0 && (i!=(n/i)) ){
//                 System.out.print((n/i)+" ");
//             }
//         }
//         }
//     }

