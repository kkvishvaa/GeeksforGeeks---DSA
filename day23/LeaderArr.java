import java.util.ArrayList;

public class LeaderArr {
 
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=arr.length;
        int cur_leader=arr[n-1];
        list.add(cur_leader);
        for(int i=n-2;i>=0;i--){
            if(cur_leader<=arr[i])
            {
                cur_leader=arr[i];
                list.add(cur_leader);
              
            }
        }
        reverse(list,0,list.size()-1);
        return list;
    }
    
    static void reverse(ArrayList<Integer> list,int i,int j){     //or Collections.reverse(list);  return list;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}


