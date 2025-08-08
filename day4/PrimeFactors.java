public class PrimeFactors {
    static void primefactor(int n){
        if(n<=1)
        return;
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3+" ");
            n=n/3;
        }
        for(int i=5;i*i<=n;i+=6){
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n=n/(i+2);
            }
        }
        if(n>3){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int n=450;
        primefactor(n);
    }
}

//if n is a prime no., then time complexity is theta(root(n))