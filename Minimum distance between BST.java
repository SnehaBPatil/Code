class Solution {
    int diff=Integer.MAX_VALUE;
    int prev=-10;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return diff;
        
    }
    public  void helper(TreeNode root)
    {
        if(root==null)
        return ;
        helper(root.left);
        if(prev!=-10 && prev!=root.val && Math.abs(prev-root.val)<diff)
        diff=Math.abs(prev-root.val);
        prev=root.val;
        helper(root.right);
        
    }
}
