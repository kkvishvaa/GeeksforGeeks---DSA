public class GetFirstSetBit {
    public static int getFirstSetBit(int n) {
        // code here
        
        for(int i=1;i<=32;i++){        //	00000000 00000000 00000000 00010010
            if((n&(1<<(i-1)))!=0){     //not ==1 bcz 2^0 value would be 2 not 1 
                 return i;
                
        }
        
        
            
        }
        return 0;
    }
} 
    

