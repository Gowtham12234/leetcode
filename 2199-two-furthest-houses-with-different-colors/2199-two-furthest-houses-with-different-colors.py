class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        n=len(colors)
        diff=0
        for i in range(n):
            for j in range(i+1,n):
                if colors[i]!=colors[j]:
                    diff1=abs(j-i)
                    diff=max(diff,diff1)
        return diff
        