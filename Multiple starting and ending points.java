class solution
{
  public static sol(int n,int m,int a[][])
  { int max=Integer.MIN_VALUE;
    for(int i=0;i<m;i++)
    {
      max=Math.max(helper(n,i,a[][]),max);
    }
  }
  public static int helper(int n,int m,int a[][])
  {
    if(i==0)
      return a[0][j];
    int s=a[i][j]+helper(n-1,m,a);
    int l=a[i][j]+helper(n-1,m-1,a);
    int r=a[i][j]+helper(n,m-1,a);
    return Math.max(s,Math.max(l,r));
  }
    
