class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        repeat={}
        for i in nums:
            if i in repeat:
                return True
            else:
                repeat[i] = 1
        return False
        