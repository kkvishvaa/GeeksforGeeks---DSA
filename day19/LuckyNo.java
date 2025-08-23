public class LuckyNo {

    public static boolean isLucky(int n) {
        // code here
        int a=isLucky1(n,2)+1;
        return a==n;
    }
    public static int isLucky1(int n,int k){
        if(n==1)
          return 0;
        return (isLucky1(n-1,k)+k)%n;
    }
}

