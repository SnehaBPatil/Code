class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j]=-1;

            }
        }
        return helper(m-1,n-1,dp,grid);

        
    }
    public int helper(int m,int n,int [][]dp,int grid[][])
    {
        if(m==0 && n==0)
        return grid[0][0];
        if(m<0 || n<0)
        return 1000;
        int up=1000;
        int left=1000;
        if(dp[m][n]!=-1)
        return dp[m][n];
        if(m>0)
        up=grid[m][n]+helper(m-1,n,dp,grid);
        if(n>0)
        left=grid[m][n]+helper(m,n-1,dp,grid);
        dp[m][n]=Math.min(left,up);
        return dp[m][n];
    }
}
