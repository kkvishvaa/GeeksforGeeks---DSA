public class Solution {
    public int modInverse(int n, int m) {
        // code here
        int i;
       
        for(i=1;i<=m;i++){
            if ((i*n)%m==1){
                int inverse=i;
                return inverse;
            }
            
        }
       return -1; 
    }
}

