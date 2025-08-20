public class Josephus {
    public int josephus(int n, int k) {
        // code here
         return josephus1(n,k)+1;
    }
    public int josephus1(int n,int k){
        if(n==1)
         return 0;
        return (josephus1(n-1,k)+k)%n;
    }
}

//time complexity-O(n)
//T(n)=T(n-1)+O(1)
