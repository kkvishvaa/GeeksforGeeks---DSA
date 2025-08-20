public class TowerOfHanoi {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        return (int)Math.pow(2,n)-1;
    }
}


// void TOH(int n,char A,char B,char C){
//     if(n==1){
//         System.out.println("Move 1 from"+A+"to"+C);
//         return;   
//     }
//     TOH(n-1,A,C,B);
//     System.out.println("Move "+n+" from "+A+" to "+C);
//     TOH(n-1,B,A,C);
// }