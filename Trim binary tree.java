class Solution {
    TreeNode n;
    public TreeNode trimBST(TreeNode root, int low, int high) {

        return helper(root,low,high);

        
    }
    public TreeNode insert(TreeNode root,TreeNode cur)
    {
        if(root==null)
        {
            root=cur;
            return root;
        }
    
        if(cur.val <root.val)
        root.left=insert(root.left,cur);
        else
        root.right=insert(root.right,cur);
        return root;
    }
    public TreeNode helper(TreeNode root,int low,int high)
    {
        if(root==null)
        return null;
        if(root.val<low)
        helper(root.right,low,high);
        else if(root.val >high)
        helper(root.left,low,high);
        else
        {
            TreeNode cur=new TreeNode(root.val);
            n=insert(n,cur);
            helper(root.left,low,high);
            helper(root.right,low,high);
        }
        return n;
    }

}
