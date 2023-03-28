class Solution {
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        Arrays.fill(dp,-1);
        return findminCost(days,costs,0);
    }

    public int findminCost(int[] days,int[] costs,int curr)
    {
        if(curr>=days.length) return 0;

        if(dp[curr]!=-1)  return dp[curr];

        int ans1=findminCost(days, costs, curr+1)+costs[0];

        int i=curr;

        for(;i<days.length && days[i]<days[curr]+7;i++);
        int ans2=findminCost(days, costs, i)+costs[1];

        i=curr;
        for(;i<days.length && days[i]<days[curr]+30;i++);
        int ans3=findminCost(days, costs, i)+costs[2];

        return dp[curr] = Math.min(Math.min(ans1,ans2),ans3);
    }
}