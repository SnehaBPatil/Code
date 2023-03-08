
class Solution {
    List<Integer>ans=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        helper(root1);
        helper(root2);
        Collections.sort(ans);
        return ans;
    
        
    }
    public void helper(TreeNode cur)
    {
        if(cur==null)
        return ;
        helper(cur.left);
        ans.add(cur.val);
        helper(cur.right);
    }
}
