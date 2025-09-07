public class PartyCouple {
    static int findSingle(int[] arr) {
        // code here
        int res=0;
        for(int num:arr){
            res^=num;
        }
        return res;
    }
}

