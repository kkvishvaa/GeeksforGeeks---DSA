// public class factorial {
//     int fact(int n)
//     {
//         int i=1;
//         for(int j=1;j<=n;j++)
//         {
//             i=i*j;
//         }
//         return i;
//     }
//     public static void main(String[] args) {
//         factorial f = new factorial();
//         int result = f.fact(5);
//         System.out.println("Factorial: " + result);   //theta(n) time complexity //theta(1) auxiliary space complexity
//     }
// }


public class factorial {

    int fact(int n){
        if(n==0){
            return 1;
        }
        int fact=n*fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        factorial f = new factorial();
        int result = f.fact(5);
        System.out.println("Factorial: " + result);  //theta(n) time complexity //theta(n) auxiliary space complexity
    }
}
