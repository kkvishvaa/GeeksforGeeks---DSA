import java.util.ArrayList;

public class PowerSetRecursion {
    public ArrayList<String> powerSet(String s) {            
        // code here   
          ArrayList<String> list=new ArrayList<>();             //passing the same obj
        return powerSetAD(s,"",0,list);
    }
    public ArrayList<String> powerSetAD(String s,String cur,int i,ArrayList<String> list){
     
      
        if(i==s.length()){
            list.add(cur);
            return list;
        }
        powerSetAD(s,cur,i+1,list);
        powerSetAD(s,cur+s.charAt(i),i+1,list);
        return list;                                          //returns it merged
    }
}

