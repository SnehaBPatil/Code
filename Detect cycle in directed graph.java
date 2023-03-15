
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[]=new boolean[V];
        Arrays.fill(vis,false);
        boolean rec[]=new boolean[V];
        Arrays.fill(rec,false);
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            {
                if(cycle(i,adj,vis,rec)==true)
                return true;
            }
        }
        return false;
        // code here
    }
    public boolean cycle(int v,ArrayList<ArrayList<Integer>>adj,boolean vis[],boolean rec[])
    {
        vis[v]=true;
        rec[v]=true;
        for(Integer neig:adj.get(v))
        {
            if(!vis[neig])
            {
                if(cycle(neig,adj,vis,rec)==true)
                return true;
            }
            else if(rec[neig])
            {
                return true;
            }
            
        }
        
        rec[v]=false;
        return false;
    }
}
