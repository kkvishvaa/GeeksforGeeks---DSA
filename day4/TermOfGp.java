class TermOfGp {
    static double termOfGP(int a, int b, int n) {
        // code here
        double r=(double)b/a;
        return a*Math.pow(r,n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(termOfGP(1, 2, 5));
    }
}
