class Solution {
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
         calculate(root);
         return root;
        
    }
    public void calculate(TreeNode root)
    {
        if(root==null)
        return ;
        calculate(root.right);
        root.val=sum+root.val;
        sum=root.val;
        calculate(root.left);
    
    }
}
