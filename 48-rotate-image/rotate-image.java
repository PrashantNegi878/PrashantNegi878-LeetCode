class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        int temp=0;
        for(int i=1;i<l;i++)
        {
            for(int j=0;j<=i;j++)
            {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; 
            }
        }
        for(int i = 0; i < l/2; i ++){
            for(int j=0;j<l;j++){
                temp=matrix[j][i];
                matrix[j][i]=matrix[j][l-1-i];
                matrix[j][l-1-i]=temp;
        }

        }
    }
}