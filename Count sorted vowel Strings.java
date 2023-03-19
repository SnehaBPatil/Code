class Solution {
    public int countVowelStrings(int n) {
        if(n==1)
        return 5;
        if(n==2)
        return 15;
        int ans=(n+4)*(n+3)*(n+2)*(n+1);
        ans=ans/24;
        return ans;
        
    }
}
