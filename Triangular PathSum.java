class solution
{
  public static int helper(int n,int i,int j,int a[][])
  {
    if(i==n)
      return a[i][j];
    return a[i][j]+Math.min(helper(n,i,j+1,a),helper(n,i,j+1,a));
  }
}
