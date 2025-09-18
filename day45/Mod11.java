public class Mod11 {
    static int xmod11(String x) {
        // code here
    
        int remainder=0;
        for(int i=0;i<x.length();i++){
            int digit=x.charAt(i)-'0';
            remainder=(remainder*10+digit)%11;
            
        }
        return remainder;
    }
}

