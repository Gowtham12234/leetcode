class Solution(object):
    def defangIPaddr(self, address):
        ans=""
        for i in address:
            
            if  i == ".":
                i="[.]"
                ans+=i
            else:
                ans+=i
        return ans
        
        