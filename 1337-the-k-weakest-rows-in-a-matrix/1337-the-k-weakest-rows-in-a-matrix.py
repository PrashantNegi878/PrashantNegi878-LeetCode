class Solution(object):
    def kWeakestRows(self, mat, k):
        arr2=[]
        finalarr=[]
        for i in range(len(mat)):
            arr2.append([i,mat[i].count(1)])
        arr2.sort(key=lambda x:x[1])
        for i in range (k):
            finalarr.append(arr2[i][0])
        return finalarr
            
        