class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++)
            spells[i]=potions.length-bfs(spells[i], success, potions);
        return spells;        
    }

    public int bfs(int curr, long success, int[] potions)
    {
        int l=0,r=potions.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            long currSum=(long)potions[mid]*curr;
            if(currSum<success)
                l=mid+1;
            else
                r=mid-1;
        }
        return l;
    }
}