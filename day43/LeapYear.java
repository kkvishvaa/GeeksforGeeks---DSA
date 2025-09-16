
import java.util.*;
public class LeapYear {
    //Back-end complete function Template for Java

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                     System.out.println("True");
                }
                else{
                     System.out.println("False");
                }
            }
            else{
                 System.out.println("True");
            }
            
            
        }
        else{
             System.out.println("False");
        }
    }
}

