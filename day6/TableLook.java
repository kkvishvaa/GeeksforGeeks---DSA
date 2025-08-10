public class TableLook {
    static int[] tbl=new int[256];
    static void initialize(){
        tbl[0]=0;
        for(int i=1;i<256;i++){
            tbl[i]=tbl[i&(i-1)]+1;
        
        }
    }

    static int countSetBits(int n){
        return tbl[n& 255]+tbl[n>>8 & 255]+tbl[n>>6 & 255] + tbl[(n>>24)];
    }

    public static void main(String[] args) {
        
        initialize();
        System.out.println(countSetBits(13));
    }

    
    
    
}
