class Solution {
    public int numberOfArrays(String s, int k) {
        int mod =  1_000_000_007;
        int l=s.length();
        int[] dp= new int[l+1];
        dp[0]=1;

        for(int i=1;i<=l;i++)
        {
            int ans=0;
            int start=l-i;
            for(int j=start;j<Math.min(l,start+9);j++)
            {
                String num =  s.substring(start,j+1);
                if(num.charAt(0)=='0') continue;
                int val =  Integer.parseInt(num);
                if(val<=k)
                {
                    ans = (ans + dp[l-j-1])%mod;
                }
                else break;
            }
            dp[i] = ans%mod;
        }
        return dp[l];
    }
}