class Solution {
    
    public List<List<Integer>> subsets(int[] a) {
       List<List<Integer>>ans=new ArrayList<>();
        List<Integer>k=new ArrayList<>();
        if(a.length==1)
        {k.add(a[0]);
            ans.add(k);
            ans.add(new ArrayList<>());
            return ans;
        }
        helper(a,0,k,a.length,ans);
        return ans;
        
    }
    public void helper(int a[],int i,List<Integer>k,int n,List<List<Integer>>ans)
    {
        if(i>=n)
        {
            ans.add(new ArrayList<>(k));
            return ;
        }
        else
        {
        k.add(a[i]);
        helper(a,i+1,k,n,ans);
        k.remove(k.size()-1);
        helper(a,i+1,k,n,ans);
        }

    }
}
