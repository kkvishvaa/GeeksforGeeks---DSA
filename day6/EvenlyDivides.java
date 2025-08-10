// User function Template for Java

public class evenlyDivides {
    static int EvenlyDivides(int n) {
        // code here
        int num=n;
        int count=0;
        while(n>0){
            int d=n%10;
            if(d!=0 && num%d==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
       
        System.out.println(EvenlyDivides(101));
    }
}