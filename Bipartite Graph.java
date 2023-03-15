class Solution {
    public boolean isBipartite(int[][] grid) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                adj.get(i).add(grid[i][j]);
                adj.get(grid[i][j]).add(i);
            }
        }
      
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++)
        { if(color[i]==-1)
            {if(helper(adj,color,i)==false)
                return false;}
            
        }
     return true;
        
    }
    public boolean  helper(ArrayList<ArrayList<Integer>>adj,int color[],int start)
    {
     
     Queue<Integer>q=new LinkedList<>();
     q.add(start);
     color[start]=0;
     while(!q.isEmpty())
     {
         int c=q.peek();
         q.remove();
         for(Integer neig:adj.get(c))
         {
             if(color[neig]==-1)
             {
                 color[neig]=Math.abs(1-color[c]);
                 
                 q.add(neig);
             }
             else if(color[neig]==color[c])
             {
                 return false;
             }
         }
     }
     return true;
    }
}
