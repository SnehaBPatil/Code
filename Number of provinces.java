class Solution {
    public int findCircleNum(int[][] a) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int v=a.length;
        boolean vis[]=new boolean[v];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
        
    }
    public void dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean vis[])
    {
        vis[v]=true;
        for(Integer neigh:adj.get(v))
        {
            if(!vis[neigh])
            dfs(neigh,adj,vis);
        }
    }
}
