public class DecToBin {
    public static void toBinary(int n) {
        // code here
        if(n==0){
            System.out.print(0);
            return;
        }
         StringBuilder sb=new StringBuilder();
         while(n>0){
            
            sb.append(n%2);
            n=n/2;
        }
        System.out.print(sb.reverse());
    }
}


