public class GrayToBinary {
  
    public static int grayToBinary(int n) {
        // code here
        int binary=n;
        while(n>0){
         n>>=1;
         binary^=n;
        }
        return binary;
        }
    }



