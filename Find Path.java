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
        bfs(source,destination,adj,vis);
        if(vis[destination]==true)
        return true;
        else
        return false;
        
        
    }
    public void bfs(int src,int dest,ArrayList<ArrayList<Integer>>adj,boolean vis[])
    {
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        vis[src]=true;
        while(!q.isEmpty())
        {
            int node=q.peek();
            q.remove();
            for(Integer neig:adj.get(node))
            {
                if(vis[neig]==false)
                {
                    q.add(neig);
                    vis[neig]=true;
                }
            }
        }

        

    }
}
