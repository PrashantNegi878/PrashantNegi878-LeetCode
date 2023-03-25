class Solution {
    public String getHint(String secret, String guess) {
        int[] nums = new int[10];
        int l=secret.length(),bull=0,cow=0;
        for(int i=0;i<l;i++)
        {
            if(secret.charAt(i)==guess.charAt(i))bull+=1;
            else
            {
                if(nums[secret.charAt(i)-'0']++<0)cow++;
                if(nums[guess.charAt(i)-'0']-->0)cow++;
            }
        }
        return bull+"A"+cow+"B";
    }
}