class Solution:
    def maximumUnits(self, b: List[List[int]], truck: int) -> int:
        b.sort(key=lambda p:p[1],reverse=True)
        print(b)
        units=0
        i=0
        m=0
        k=0
        for i in range(0,len(b)):
            while(b[i][0]!=0):
                if(k==truck):
                    return m
                k=k+1
                b[i][0]=b[i][0]-1
                m=m+b[i][1]
        return m




