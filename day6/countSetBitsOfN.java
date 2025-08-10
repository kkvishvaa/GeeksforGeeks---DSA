class Solution {
    static int[] tbl=new int[256];
    static {
        initialize();
    }
    public static int countSetBits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
        int x=i;
        count+=tbl[(x&255)]+tbl[(x>>8) & 255]+tbl[(x>>16) & 255]+tbl[(x>>24) & 255];
        }
        return count;
    }
        
    
    public static void initialize(){
        tbl[0]=0;
        for(int i=1;i<256;i++){
            tbl[i]=tbl[(i&(i-1))]+1;
            
        }
     
    }
    
   
}