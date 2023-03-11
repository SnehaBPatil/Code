class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        a=set(s)
        n=len(a)
        i=len(a)
        if i==0:
            return 0
        while i>0:
            for j in range(0,len(s)):
                if(j+i-1<len(s)):
                    if(len(set(s[j:j+i]))==len(s[j:j+i])):
                        return i
            i=i-1
        return 0
        
