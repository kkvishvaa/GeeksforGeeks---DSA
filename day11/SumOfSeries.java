public class SumOfSeries {
    // User function Template for Java
    int sumOfSeries(int n) {
        // code here
        int res=0;
        for(int i=1;i<=n;i++){
            res=res+(int)Math.pow(i,3);
        }
        return res;
    }
}
    

