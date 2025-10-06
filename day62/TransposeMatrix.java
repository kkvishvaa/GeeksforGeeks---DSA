import java.util.ArrayList;

public class TransposeMatrix {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int row=mat.length;
        int column=mat[0].length;
        for(int i=0;i<row;i++){
             ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<column;j++){
               temp.add(mat[j][i]);
                
            }
            list.add(temp);
        }
        return list;
        
    }
}

