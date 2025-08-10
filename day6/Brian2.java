class Solution {
    public static int countSetBits(int n) {
        // code here
        int res=0;
        for(int i=1;i<=n;i++){
            int x=i;
        while(x>0){
            x=x&(x-1);
            res+=1;
        }}
        return res;
    }
}