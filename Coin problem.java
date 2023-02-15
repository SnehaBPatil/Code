import java.util.Arrays;

public class coin {
    public static void main(String[] args) {
        int a[]={7,5,1};
        int n=18;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        System.out.println(Arrays.toString(dp));
        System.out.println(recurdp(a,n,dp));
        System.out.println(recurrsion(a,n));
    }
    public static int recurdp(int a[],int n,int dp[])
    {
        if(n==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if((n-a[i])>=0)
            {int sub=0;
                if(dp[n-a[i]]==-1)
                {
                    sub=recurdp(a,n-a[i],dp);
                }
                else {
                    sub=dp[n-a[i]];
                }
                if(sub +1< ans && sub!=Integer.MAX_VALUE)
                    ans=sub+1;
            }
        }
        dp[n]=ans;
        return ans;
    }
    public static int recurrsion(int a[],int n)
    {
        if(n==0)
            return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if (n - a[i] >= 0) {
                int sub = recurrsion(a, n - a[i]);
                if (ans > sub + 1) {
                    ans = sub + 1;
                }

            }
        }
        return ans;
    }
}
