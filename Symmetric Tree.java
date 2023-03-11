class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(helper(root,root))
            return true;
        else
            return false;
        
    }
    public boolean helper(TreeNode n1,TreeNode n2)
    {
        if(n1==null && n2==null)
            return true;
        if(n1==null || n2==null)
            return false;
         if(n1.val!=n2.val)
            return false;
        return (helper(n1.left,n2.right) && helper(n1.right,n2.left));
          
    }
}
