class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        n=0
        for i in range(0,len(jewels)):
            n=n+stones.count(jewels[i])
        return n
