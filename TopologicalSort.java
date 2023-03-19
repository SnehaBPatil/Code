
class Solution
{
     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        Stack<Integer>ans=new Stack<>();
        boolean vis[]=new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            dfs(i,adj,vis,ans);
        }
        int n[]=new int[V];
        int index=0;
        while(!ans.isEmpty())
        {
            n[index]=ans.pop();
            index++;
            
        }
        return n;
    }
     static void dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean vis[],Stack<Integer>ans)
    {
        vis[v]=true;
        for(Integer i:adj.get(v))
        {
            if(!vis[i])
            dfs(i,adj,vis,ans);
            
        }
        ans.push(v);
    }
}
