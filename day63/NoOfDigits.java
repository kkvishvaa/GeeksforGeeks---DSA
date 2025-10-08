import java.util.*;

public class NoOfDigits {


    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digits=(int)Math.log10(n)+1;
        System.out.println(digits);
    }
}

