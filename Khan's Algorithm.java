class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {Queue<Integer>q=new LinkedList<>();
        int indeg[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(Integer j:adj.get(i))
            {
                indeg[j]++;
            }
        }
        for(int i=0;i<V;i++)
        {
            if(indeg[i]==0)
            q.add(i);
        }
        int index=0;
        int ans[]=new int[V];
        while(!q.isEmpty())
        {
            int cur=q.peek();
            q.remove();
            ans[index]=cur;
            index++;
            for(Integer it:adj.get(cur))
            {
                indeg[it]--;
                if(indeg[it]==0)
                q.add(it);
            }
            
        }
        return ans;
    }
}
