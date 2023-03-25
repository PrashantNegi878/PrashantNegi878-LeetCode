class Solution {
    public boolean isPalindrome(int x) {
        int originalValue=x;
        int y=0;
        while(x>0)
        {
            int temp=x%10;
            y=y*10+temp;
            x=x/10;
        }
        System.out.println(y);
        if(originalValue==y)
            return true;
        return false;
    }
}