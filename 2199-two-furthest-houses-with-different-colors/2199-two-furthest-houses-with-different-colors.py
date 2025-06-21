class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        n=len(colors)
        ans=0
        # for i in range(n):
        #     for j in range(i+1,n):
        #         if colors[i]!=colors[j]:
        #             diff1=abs(j-i)
        #             diff=max(diff,diff1)
        # return diff

        for i in range(n-1,-1,-1):
            if colors[i]!=colors[0]:
                diff=i
                ans=max(ans,diff)
                break
        for i in range(n):
            if colors[i]!=colors[n-1]:
                diff=n-1-i
                ans=max(ans,diff)
        return ans
        