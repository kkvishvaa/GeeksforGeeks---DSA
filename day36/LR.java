// You are given two integer arrays L[] and R[], where each L[i] and R[i] define the start and end of a range respectively. The goal is to find the integer that appears in the most number of these ranges. 
// If multiple integers occur in the same maximum number of ranges, then return the smallest integer among them. 

import java.util.List;

public class LR {

    public int maxOccured(List<Integer> L, List<Integer> R) {
        // code here
        int n=L.size();
        int MAX=1000000;
        int[] freq=new int[MAX+2];
        for(int i=0;i<n;i++){
            freq[L.get(i)]++;
            freq[R.get(i)+1]--;
        }
        int res=freq[0];
        int resindex=0;
        for(int i=1;i<=MAX;i++){
            freq[i]+=freq[i-1];
        
            if(res<freq[i]){
                res=freq[i];
                resindex=i;
            }
        }
        return resindex;
    }
}


