class Solution {
    public int rob(int[] h) {
        int dp[]=new int[h.length];
        Arrays.fill(dp,-1);
        return helper(h,h.length-1,dp);
        
    }
    public int helper(int []h,int index,int dp[])
    {
        if(index==0)
        return h[0];
        if(index<0)
        return 0;
        if(dp[index]!=-1)
        return dp[index];
        int pick=h[index]+helper(h,index-2,dp);
        int notpick=helper(h,index-1,dp);
        dp[index]=Math.max(pick,notpick);
        return dp[index];
    }
}
