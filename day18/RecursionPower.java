class RecursionPower {
    static int RecursivePower(int n, int p) {
        // Code here
    
        if(p==0)
         return 1;
        int temp=RecursivePower(n,p/2);
        temp=temp*temp;
        if(p%2==0)
           return temp;
        else
           return temp*n;
    }
}
