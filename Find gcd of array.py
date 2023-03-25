class Solution:
    def findGCD(self, nums: List[int]) -> int:
        nums.sort()
        a=nums[0]
        b=nums[-1]
        from math import gcd
        return gcd(a,b)
