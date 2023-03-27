class Solution {
    public int uniquePathsWithObstacles(int[][] o) {
        int dp[][]=new int[o.length][o[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            dp[i][j]=-1;
        }
        return helper(o.length-1,o[0].length-1,dp,o);
        
    }
    public int helper(int m,int n,int dp[][],int o[][])
    {
        if(m==0 && n==0 && o[0][0]!=1)
        return 1;
      
        if(m<0 || n<0)
        return 0;
        if(o[m][n]==1)
        {
            dp[m][n]=0;
            return 0;
        }
        if(dp[m][n]!=-1)
        return dp[m][n];
        dp[m][n]= helper(m-1,n,dp,o)+helper(m,n-1,dp,o);
        return dp[m][n];
    }
}
