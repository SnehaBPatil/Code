
class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
      char[][]ans=new char[n][m];
      boolean vis[][]=new boolean[n][m];
     
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          vis[i][j]=false;
      }
      for(int i=0;i<n;i++)
      {
          if(a[i][0]=='O' && vis[i][0]==false)
          {
              dfs(a,vis,i,0,n,m);
              
          }
          if(a[i][m-1]=='O' && vis[i][m-1]==false)
          dfs(a,vis,i,m-1,n,m);
      }
      for(int i=0;i<m;i++)
      {
          if(a[0][i]=='O' && vis[0][i]==false)
          {
              dfs(a,vis,0,i,n,m);
              
          }
          if(a[n-1][i]=='O' && vis[n-1][i]==false)
          dfs(a,vis,n-1,i,n,m);
      }
      
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(vis[i][j]==true)
              {
                  ans[i][j]='O';
              }
              else
              {
                  ans[i][j]='X';
              }
          }
      }
      return ans;
    }
    static void dfs(char[][]a,boolean vis[][],int r,int c,int n,int m)
    {
        vis[r][c]=true;
        int delr[]={-1,0,1,0};
        int delc[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nr=r+delr[i];
            int nc=c+delc[i];
            if(nr >=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==false && a[nr][nc]=='O')
            {
                dfs(a,vis,nr,nc,n,m);
            }
        }
    }
}
