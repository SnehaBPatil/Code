import java.util.*;
public class LCS {
	public static void main(String[] args)
	{
		String a="abcda";
		String b="bdabac";
		int k=usingmem(a,b,a.length(),b.length());
		System.out.println(k);
	}
	public static int lcs (String a,String b)
	{
		int dp[][]=new int[a.length()+1][b.length()+1];
		for(int i=1;i<=a.length();i++)
		{
			for(int j=1;j<=b.length();j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else
				{
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		
		}
		int k=dp[a.length()][b.length()];
		return k;
	}
	public static int lcsusingrecurrsion(String a,String b,int m,int n)
	{
		if(m==a.length() || n==b.length())
			return 0;
		if(a.charAt(m)==b.charAt(n))
			return 1+lcsusingrecurrsion(a,b,m+1,n+1);
			else
				return Math.max(lcsusingrecurrsion(a,b,m,n+1), lcsusingrecurrsion(a,b,m+1,n));
		
	}
	public static int usingmem(String a,String b,int m,int n)
	{
		if(m==0 || n==0)
			return 0;
		if(a.charAt(m-1)==b.charAt(n-1))
			return 1+usingmem(a,b,m-1,n-1);
			else
				return Math.max(usingmem(a,b,m,n-1), usingmem(a,b,m-1,n));
		
	}

}
