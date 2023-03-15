class Node
{
    int r;
    int c;
    int s;
    Node(int r,int c,int s)
{
    this.r=r;
    this.c=c;
    this.s=s;
}
}
class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
    int m=grid.length;
    int n=grid[0].length;
    Queue<Node>q=new LinkedList<>();
    int vis[][]=new int[m][n];
    int dis[][]=new int[m][n];

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1)
            {
                q.add(new Node(i,j,0));
                vis[i][j]=1;
            }
        }
    }
    int delr[]={-1,0,1,0};
    int delc[]={0,1,0,-1};
    while(!q.isEmpty())
    {
        int nr=q.peek().r;
        int nc=q.peek().c;
        int s=q.peek().s;
        q.remove();
        dis[nr][nc]=s;
        for(int i=0;i<4;i++)
        {
            int newr=nr+delr[i];
            int newc=nc+delc[i];
            if(newr>=0 && newr<m && newc>=0 && newc<n && vis[newr][newc]==0)
            {
                q.add(new Node(newr,newc,s+1));
                vis[newr][newc]=1;
            }
        }
    }
    return dis;
    
    }
}
