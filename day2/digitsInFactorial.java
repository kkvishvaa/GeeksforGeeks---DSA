public class digitsInFactorial {
    public int count(int n) {
        if(n==1 || n==0)
        return 1;
        double sum=0;
        for(int i=2;i<=n;i++)
        {
            sum+=Math.log10(i);
        }
        return (int)sum+1;
    }
    public static void main(String[] args) {
        digitsInFactorial sol = new digitsInFactorial();
        int n = 5;
        int result = sol.count(n);
        System.out.println("Number of digits in " + n + "! is: " + result); 
    }
}
