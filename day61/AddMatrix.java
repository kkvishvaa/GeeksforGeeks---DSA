public class AddMatrix {

    public void Addition(int[][] matrixA, int[][] matrixB) {
        // code here
        int row=matrixA.length;
        int col=matrixA[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;i++){
                matrixA[i][j]+=matrixA[i][j]+matrixB[i][j];
            }
        }
    }
}

