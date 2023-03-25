class Solution:
    def findDifferentBinaryString(self, nums: List[str]) -> str:
        from itertools import combinations_with_replacement
        n=""
        perm=list(combinations_with_replacement([0,1], len(nums[0])) )
        
        l=""
        lis=[]
        for p in perm:
            for i in p:
                l=l+str(i)
            lis.append(l)
            l=""
        print(lis)
        for p in lis:
            st=""
            if(nums.count(p)==0):
                return p
        return ""
