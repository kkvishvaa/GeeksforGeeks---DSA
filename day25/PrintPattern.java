import java.util.*;

public class PrintPattern {
    public ArrayList<Integer> pattern(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        pattern1(list,n);
        return list;
    }
    public void pattern1(ArrayList<Integer> list,int n){
        list.add(n);
        if(n<=0){
            return;
        }
        pattern1(list,n-5);
        list.add(n);
    } 
 }


