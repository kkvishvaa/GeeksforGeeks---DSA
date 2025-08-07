public class Trailingzeroes {
    int countTrainlingZeroes(int n){
    int res=0;
    for(int i=5;i<=n;i=i*5)
    {
     res=res+(n/i);
    }
     return res;
}

public static void main(String[] args) {
    int num=251;
    Trailingzeroes zeroes=new Trailingzeroes();
    int result=zeroes.countTrainlingZeroes(num);
     System.out.println("no of zeroes:"+result);
}
}   


