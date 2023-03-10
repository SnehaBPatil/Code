class Solution {
    public boolean canPartition(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        if(sum%2!=0)
        return false;
        else
        return(sub(sum/2,a));
        
    }
    public boolean sub(int sum,int []a)
    {
        int dp[][]=new int[a.length+1][sum+1];
        dp[0][0]=1;
        for(int i=1;i<dp.length;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=a.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(dp[i-1][j]==1)
                dp[i][j]=1;
                else if(j<a[i-1])
                dp[i][j]=0;
                else
                {
                    dp[i][j]=dp[i-1][j-a[i-1]];
                }
            }
        }
        if(dp[a.length][sum]==1)
        return true;
        else
        return false;
    }
}
