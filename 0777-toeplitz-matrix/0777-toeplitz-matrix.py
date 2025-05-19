class Solution(object):
    def isToeplitzMatrix(self, matrix):
        rows=len(matrix)
        cols=len(matrix[0])

        for i in range(0,rows-1):
            for j in range(0,cols-1):
                if(matrix[i][j]!=matrix[i+1][j+1]):
                    return False
                j+=1
            i+=1
        return True
        