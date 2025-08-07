import java.util.*;
public class gdc_lcm {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("ENTER a and b:");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int result = lcm(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + result);
    }

}

//time complexity: O(log(min(a, b))) 