//Given an array arr[] and two elements x and y, return the element that occurs more frequently. If both elements have the same frequency, return the smaller one.
//Basic 1
public class Majority {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countx=0;
        int county=0;
        for(int num:arr){
            if(num==x)
             countx++;
            if(num==y)
             county++;
        }
        if(countx>county)
         return x;
        else if(county>countx)
         return y;
        else
         return Math.min(x,y);
    }
}

