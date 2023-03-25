class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        while(s.find(part)!=-1):
            index=s.find(part)
            s= s[0:index] + s[index + len(part):len(s)]
        return s
