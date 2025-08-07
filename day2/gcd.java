//not an efficient solution

// class Solution {
//     public static int gcd(int a, int b) {
//         // code here
//         int res=Math.min(a,b);
//         while(res>0)
//         {
//             if((a%res)==0 && (b%res)==0)
//             {
//                 break;
//             }
//             res--;
//         }
//         return res;
//     }
// }


//efficient solution
public class gcd{
    static int gcomd(int a,int b){
        if(b==0){
            return a;
        }
        return gcomd(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println("GCD:"+gcomd(12,13));
    }
}