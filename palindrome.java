import java.util.Scanner;

public class palindrome {
static boolean isPal(int n)
{
 int temp=n;
 int rev=0;
 while (temp!=0)
 {
 int ld=temp%10;
 rev=rev*10+ld;
 temp=temp/10;
 }
 return (rev==n);
}
public static void main(String[] args) {
  
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=Sc.nextInt();
  boolean Result =isPal(num);
  System.out.println("Result:"+Result);
}
}
  

