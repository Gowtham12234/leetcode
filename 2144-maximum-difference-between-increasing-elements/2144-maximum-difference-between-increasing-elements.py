class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        n=len(nums)
        diff=-1
        for i in range(n):
            for j in range(i+1,n):
                if nums[i]<nums[j]:
                    diff1=nums[j]-nums[i]
                    diff=max(diff,diff1)
        return diff