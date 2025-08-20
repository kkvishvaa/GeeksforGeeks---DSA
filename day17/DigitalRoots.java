public class DigitalRoots {

    public static int digitalRoot(int n) {
      while(n>=10){
          n=sumOfDigits(n);
      }
      return n;
    }
    public static int sumOfDigits(int n){
        if(n==0)
        return 0;
        return n%10+sumOfDigits(n/10);
    }
}

