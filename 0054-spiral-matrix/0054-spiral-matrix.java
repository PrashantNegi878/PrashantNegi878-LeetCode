class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int b=matrix.length-1,t=0;
        int r=matrix[0].length-1,l=0;
        int i=0,j=0;
        List<Integer> result = new ArrayList<>();
        while(t<=b || l<=r)
        {
            if(t<=b)
            {
            for(i=l;i<=r;i++)
            {
                result.add(matrix[t][i]);
            }
            t+=1;
            }
            if(l<=r)
            {
            for(j=t;j<=b;j++)
            {
                result.add(matrix[j][r]);
            }
            r-=1;
            }
            if(t<=b)
            {
            for(i=r;i>=l;i--)
            {
                result.add(matrix[b][i]);
            }
            b-=1;
            }
            if(l<=r)
            {
            for(j=b;j>=t;j--)
            {
                result.add(matrix[j][l]);
            }
            l+=1;
            }
        }
        return result;
        }
}