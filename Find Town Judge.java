class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        int m=trust.length;
        for(int i=0;i<m;i++)
        {
            adj.get(trust[i][0]).add(trust[i][1]);
        }
        int index=-1;
        for(int i=1;i<=n;i++)
        {
            if(adj.get(i).size()==0)
           { index=i;
           break;}
        }
        for(int i=1;i<=n;i++)
        {
            if(i!=index)
            {
                if(adj.get(i).contains(index)==false)
                return -1;
            }
        }
        return index;

        
    }
}
