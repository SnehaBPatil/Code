class Solution:
    def sortPeople(self, n: List[str], h: List[int]) -> List[str]:
        hdict=dict(zip(h,n))
       
        f=[]
        for i in sorted(hdict.keys(),reverse=True):
            f.append(hdict[i])
        return f

        
