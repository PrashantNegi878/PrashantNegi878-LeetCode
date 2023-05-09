class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int b=n-1,t=0;
        int r=n-1,l=0;
        int i=0,j=0;
        int count=1;
        while(t<=b || l<=r)
        {
            for(i=l;i<=r;i++)
            {
                result[t][i]=count++;
            }
            t+=1;

            for(j=t;j<=b;j++)
            {
                result[j][r]=count++;
            }
            r-=1;

            for(i=r;i>=l;i--)
            {
                result[b][i]=count++;
            }
            b-=1;

            for(j=b;j>=t;j--)
            {
                result[j][l]=count++;
            }
            l+=1;

        }
        return result;
        }
}