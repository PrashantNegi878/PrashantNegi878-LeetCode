class Solution {
    public int maxScore(String s) {
        int a=0,b=0,sum=0;
        int l=s.length();
        for(int i=0;i<l;i++) if(s.charAt(i)=='1')b+=1;
        for(int i=0;i<l-1;i++)
        {
            if(s.charAt(i)=='1') b-=1;
            else a+=1;
            sum=Math.max(sum,a+b);
        }
        return sum;
    }
}