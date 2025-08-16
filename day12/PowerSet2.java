import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet2 {
    // User function Template for Java
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> list=new ArrayList<>();
       
        int n=s.length();
        int psize=(1<<n);
        for(int i=1;i<psize;i++){
             StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                sb.append(s.charAt(j));
                }
            }
            list.add(sb.toString());
        }
        Collections.sort(list);
        return list;
    }
}

