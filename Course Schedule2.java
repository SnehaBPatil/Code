class Solution {
    public int[] findOrder(int n, int[][] graph) {
        int ans[]=new int[n];
        int indeg[]=new int[n];
        int index=0;
        if(n==1)
        return ans;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {  adj.add(new ArrayList<Integer>());

        }
        for(int i=0;i<graph.length;i++)
        {
            adj.get(graph[i][1]).add(graph[i][0]);
        }
        for(int i=0;i<n;i++){
            for(int e:adj.get(i)){
                indeg[e]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        { 
            if(indeg[i]==0)
            q.add(i);
        }
        
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
        if(index==n)
        return ans;
        else 
        {
            int arr[]={};
            return arr;
        }
    }
}
