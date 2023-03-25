class Solution(object):
    def findDuplicate(self, nums):
        l=len(nums)
        # for i in range(0,l):
        #     for j in range(0,l):
        #         if nums[i]==nums[j] and i!=j:
        #                 return nums[i]
        #                 break
        nums.sort()
        for i in range(0,l):
            if nums[i]==nums[i+1]:
                return nums[i]
                break
                        
        