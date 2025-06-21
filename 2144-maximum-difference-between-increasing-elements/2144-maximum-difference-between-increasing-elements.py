class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        n=len(nums)
        diff=-1
        low=nums[0]
        for j in range(n):
            if low<nums[j]:
                diff1=nums[j]-low
                diff=max(diff,diff1)
            low=min(low,nums[j])
        return diff