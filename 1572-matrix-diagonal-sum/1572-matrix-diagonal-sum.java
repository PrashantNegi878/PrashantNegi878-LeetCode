class Solution {
    public int diagonalSum(int[][] mat) {
        int l=mat.length;
        int s=0;
        for(int i=0;i<l;i++)
        {
            s+=mat[i][i]+mat[i][l-1-i];
        }
        if(l%2!=0)  return s-mat[l/2][l/2];
        return s;
    }
}