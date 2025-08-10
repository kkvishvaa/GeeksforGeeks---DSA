// Iterative Power (Binary Exponentiation)
import java.util.*;

public class IterativePower {
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int res=1;
        while(n>0){
            if(n%2!=0){
                res=res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(power(4, 5));
    }
}

//Time Complexity: O(log n)
//Space Complexity: O(1) 
