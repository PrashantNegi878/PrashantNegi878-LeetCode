class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] result=new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++)
        {
            for(int j=0;j<img[i].length;j++)
            {
                result[i][j]=calculate(i,j,img);
            }
        }
        return result;
    }

    public int calculate(int a, int b, int[][] img)
    {
        int sum=0;
        int totalVals=0;
        for(int i=-1;i<=1;i++)
        {
            if(a+i<0 || a+i>=img.length) continue;
            for(int j=-1;j<=1;j++)
            {
                if(b+j<0 || b+j>=img[a].length) continue;
                sum+=img[a+i][b+j];
                totalVals+=1;
            }
        }
       sum=(int)Math.floor(sum/totalVals);
        return sum;
    }
}