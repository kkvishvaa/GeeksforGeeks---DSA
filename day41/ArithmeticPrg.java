public class ArithmeticPrg {
    static int inSequence(int a, int b, int c) {
        // code here
        if((b-a)%c==0){
            int n=((b-a)/c)+1;
            if(n>0)
             return 1;
            return 0;
        }
        return 0;
    }
}

