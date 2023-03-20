class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>k=new ArrayList<>();
        helper(0,a,0,t,ans,k);
        return ans;
    }
    public void helper(int ind,int a[],int s,int t,List<List<Integer>>ans,List<Integer>k)
    {
        if(s>t)
        return;
        if(s==t)
        {   
            ans.add(new ArrayList<>(k));
            return ;
        }
        for(int i=ind;i<a.length;i++)
        {
        
            k.add(a[i]);
            helper(i,a,s+a[i],t,ans,k);
            k.remove(k.size()-1);
            
        }
        return ;

    }
}
