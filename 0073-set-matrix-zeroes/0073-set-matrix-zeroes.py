class Solution(object):
    def setZeroes(self, matrix):
        m=len(matrix)
        n=len(matrix[0])
        row0=False
        col0 =False

        for i in range(0 ,m):
            if(matrix[i][0] == 0):
                col0=True
            i+=1
        for j in range(0,n):
            if(matrix[0][j]==0):
                row0=True
                j+=1

        for i in range(1,m):
            for j in range(1,n):

                if matrix[i][j]==0:
                    matrix[i][0]=0
                    matrix[0][j]=0
        for i in range(1,m):
            for j in range(1,n):
                if matrix[i][0]==0 or matrix[0][j]==0:
                    matrix[i][j]=0

        if row0:
            for j in range(0,n):
                matrix[0][j]=0
                j+=1
        if col0:
            for i in range(0,m):
                matrix[i][0]=0
                i+=1
    
        