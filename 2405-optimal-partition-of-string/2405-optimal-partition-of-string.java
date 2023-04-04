class Solution {
    public int partitionString(String s) {
        boolean[] map= new boolean[26];
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            if(map[s.charAt(i)-'a'])
            {
                count+=1;
                map=new boolean[26];
            }
            map[s.charAt(i)-'a']=true;
        }
        return count;
    }
}