class Solution {
    Set<Character> hs = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    public int maxVowels(String s, int k) {
        int l=s.length();
        int max=countVowels(s,0,k-1);
        int tempMax=max;
        for(int i=1;i<=l-k;i++)
        {
            if(hs.contains(s.charAt(i-1)))
                tempMax-=1;
            if(hs.contains(s.charAt(i+k-1)))
                tempMax+=1;
            max=Math.max(max,tempMax);
        }
        return max;
    }

    public int countVowels(String s, int i, int j)
    {
        int total=0;
        for(int z=i;z<=j;z++)
        {
            if(hs.contains(s.charAt(z)))    total+=1;
        }
        return total;
    }
}