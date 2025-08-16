public class countSetBits {
    public static int countSetBits(int n) {
        // code here
        if(n==0)
        return 0;
        int x=larPowOf2(n);                          //formula used is x2^x-1+(n-2^x+1)+f(n-2^x)
        int y=x*(1<<(x-1));
        int z=n-(1<<x);
        int result=y+z+1+countSetBits(n-(1<<x));
        return result;
    }
    public static int larPowOf2(int n){
        int x=0;
        while ((1<<x)<=n){
            x++;
            
        }
        return x-1;
    }
}

