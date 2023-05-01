class Solution {
    public double average(int[] salary) {
        int max=salary[0],min=salary[0];
        int sum=0,l=salary.length;
        for(int i=0;i<l;i++)
        {
            sum+=salary[i];
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }

        return (double)(sum-min-max)/(l-2);
    }
}