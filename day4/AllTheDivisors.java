public class AllTheDivisors {
    static void allDivisors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
    }
    public static void main(String[] args) {
        int n=12;
        allDivisors(n);
    }
    
}


