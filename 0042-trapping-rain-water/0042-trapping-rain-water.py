class Solution(object):
    def trap(self, height):
        ht=len(height)
        left=[]
        right=[]
        l=0
        r=0
        sum=0
        for i in range(ht):
            if height[i]>l:
                l=height[i]
            left.append(l)
        for i in range(ht-1,-1,-1):
            if height[i]>r:
                r=height[i]
            right.append(r)
        right.reverse()
        for i in range(ht):
            sum+=min(left[i],right[i])-height[i]
        return sum
            
            
        