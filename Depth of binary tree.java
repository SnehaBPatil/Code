class Solution {
    public int maxDepth(TreeNode cur) {
        if(cur==null)
            return 0;
        return(Math.max(1+maxDepth(cur.left),1+maxDepth(cur.right)));
        
    }
}
