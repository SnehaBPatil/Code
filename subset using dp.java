import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=9;
        int a[]={2,3,5,7};
        System.out.println(subset(a,sum));
    }
    public static int subset(int a[],int sum) {
    int n= a.length;
    int dp[][]=new int [n+1][sum+1];
    for(int i=0;i<=n;i++)
    {
        dp[i][0]=1;
    }
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=sum;j++)
        {
            if(dp[i-1][j]==1)
            {
                dp[i][j]=1;
            }
            else {
                if(j<a[i-1])
                {
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=dp[i-1][j-a[i-1]];
                }
            }
            //System.out.println(dp[i][j]);
        }
    }
    return dp[n][sum];
    }
}
