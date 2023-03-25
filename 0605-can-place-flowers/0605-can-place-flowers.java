class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length==1)
        {
            if((flowerbed[0]==0 && n<=1) || n==0)
                return true;
            return false;
        } 
        int prev=0,next=0,total=0;
        for(int i=0;i<flowerbed.length-1;i++)
        {
            next=flowerbed[i+1];
            if(total==n) return true;
            if(prev==0 && next==0 && flowerbed[i]==0)
            {
                total+=1;
                flowerbed[i]=1;
            }  
            prev=flowerbed[i];
        }

        if(prev==0 && next==0) total+=1;

        if(total==n) return true;
        return false;
    }
}