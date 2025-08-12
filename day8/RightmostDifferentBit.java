//  Input: m = 11, n = 9
// Output: 2
// Explanation: Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different
    

class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        // code here
        int a=m^n;
        for(int i=1;i<=32;i++){
            if(((1<<(i-1))&a)!=0){
                return i;
            }
        }
        return -1;
    }
}
