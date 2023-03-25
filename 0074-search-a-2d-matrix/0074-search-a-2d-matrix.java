class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h=matrix.length-1;
        int w=matrix[0].length-1;
        int l=0,r=h;
        int hm=1;
        while(l<=r)
        {   hm=r+l/2;
            if(target>=matrix[hm][0] && target<=matrix[hm][w])
                break;
            if(matrix[hm][0]>target)
                r=hm-1;
            else
                l=hm+1;
        }
        l=0;
        r=w;
        int m=r+l/2;
        while(l<=r)
        {
            m=r+l/2;
            if(matrix[hm][m]==target)
                return true;
            if(matrix[hm][m]>target)
                r=m-1;
            else
                l=m+1;
        }
        return false;      
    }
}