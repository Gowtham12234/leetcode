class Solution(object):
    def oddCells(self, m, n, indices):
        row=[0]*m
        col=[0]*n
        
        for r,c in indices:
            row[r]+=1
            col[c]+=1
        
        count=0
        for i in range(m):
            
            for j in range(n):
                
                value=row[i]+col[j]
                if(value%2!=0):
                    count+=1

        return count