class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int x=(1<<(k-1));
        if((n&x)!=0){
            return true;
        }
        return false;
    }
}