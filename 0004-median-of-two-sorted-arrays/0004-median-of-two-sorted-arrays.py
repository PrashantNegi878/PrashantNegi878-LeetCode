class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        
        if len(nums1)%2==0:
            return (float(nums1[len(nums1)//2-1]+nums1[len(nums1)//2])/2)
            
        else:
            # print(nums1[len(nums1)//2-1],nums1[len(nums1)//2])
            return (nums1[len(nums1)//2])
            # return 1
        