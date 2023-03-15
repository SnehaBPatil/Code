class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        if(n==1)
        return true;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
        
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            
        }
        boolean vis[]=new boolean [n];
        Arrays.fill(vis,false);
        if(dfs(source,destination,adj,vis))
        return true;
        else
        return false;
        
    }
    public boolean dfs(int src,int dest,ArrayList<ArrayList<Integer>>adj,boolean vis[])
    {
        vis[src]=true;
        for(Integer neig:adj.get(src))
        {
            if(neig==dest)
            return true;
            else if(vis[neig]==false)
            {
                if(dfs(neig,dest,adj,vis)==true)
                return true;
            }
        }
        return false;

    }
}
