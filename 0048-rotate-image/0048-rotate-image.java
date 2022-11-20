class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int length = row;
        int column = matrix[0].length;

        //transpose
        for(int i=0;i<row;i++){
            for(int j=i;j<column;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i=0;i<row;i++){
            for(int j=0;j<row/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][row-1-j];
                matrix[i][row-1-j]=temp;
                }
            }
        
    }
}