class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        dic={}
        count=[]
        le=[]

        for i in range(0,len(mat)):
            count.append(mat[i].count(1))
            le.append(i)
        dic=dict(zip(le,count))
        dic=dict(sorted(dic.items(), key=lambda item: item[1]))
        m=list(dic.keys())
        
        return m[0:k]

            
            
        
