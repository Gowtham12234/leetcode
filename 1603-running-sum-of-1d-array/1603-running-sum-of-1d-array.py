class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        prefixsum=[0]*len(nums)
        prefixsum[0]=nums[0]
        for j in range(1,len(nums)):
            prefixsum[j]=prefixsum[j-1]+nums[j]
        return prefixsum

        