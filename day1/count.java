import java.util.Scanner;

public class count {
	public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=Sc.nextInt();
        int count=0;
        
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Count:"+count);
	}
}
