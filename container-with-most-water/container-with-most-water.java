class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r)
        {
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            int area=w*h;
            max=Math.max(max,area);
            if(height[l]<height[r]) l++;
            else if(height[l]>height[r])r--;
            else{l++;r--;}
        }

        return max;
    }
}