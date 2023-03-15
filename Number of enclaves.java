class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                vis[i][j]=false;
            }
        }
         for(int i=0;i<n;i++)
      {
          if(grid[i][0]==1 && vis[i][0]==false)
          {
              dfs(grid,vis,i,0,n,m);

          }
          if(grid[i][m-1]==1 && vis[i][m-1]==false)
          dfs(grid,vis,i,m-1,n,m);
      }
      for(int i=0;i<m;i++)
      {
          if(grid[0][i]==1 && vis[0][i]==false)
          {
              dfs(grid,vis,0,i,n,m);

          }
          if(grid[n-1][i]==1 && vis[n-1][i]==false)
          dfs(grid,vis,n-1,i,n,m);
      }
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(grid[i][j]==1 && vis[i][j]==false)
              count++;
          }
      }
      return count;
        
    }
    static void dfs(int[][]a,boolean vis[][],int r,int c,int n,int m)
    {
        vis[r][c]=true;
        int delr[]={-1,0,1,0};
        int delc[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
            int nr=r+delr[i];
            int nc=c+delc[i];
            if(nr >=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==false && a[nr][nc]==1)
            {
                dfs(a,vis,nr,nc,n,m);
            }
        }
    }

}
