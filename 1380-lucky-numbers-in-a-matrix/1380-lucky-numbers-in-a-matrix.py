class Solution(object):
    def luckyNumbers (self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        minmat=[]
        maxmat=[]
        finalmat=[]
        for i in range(len(matrix)):
            minmat.append(min(matrix[i]))
        for i in range(len(matrix[0])):
            temp=matrix[0][i]
            for j in range(len(matrix)):
                if matrix[j][i]>temp:
                    temp=matrix[j][i]
            maxmat.append(temp)
        for i in minmat:
            if  i in maxmat:
                finalmat.append(i)
        print(finalmat)
        return finalmat
        