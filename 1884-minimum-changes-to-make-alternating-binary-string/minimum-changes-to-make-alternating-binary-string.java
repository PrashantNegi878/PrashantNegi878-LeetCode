class Solution {
    public int minOperations(String s) {
        int result1=0,result2=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                if(s.charAt(i)=='0') result1+=1;
                else result2+=1;
            }

            if(i%2==1)
            {
                if(s.charAt(i)=='1')result1+=1;
                else result2+=1;

            }
        }
        return Math.min(result1,result2);
    }
}