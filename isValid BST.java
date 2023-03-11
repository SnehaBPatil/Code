class Solution {
    long l=Long.MIN_VALUE;
    public boolean isValidBST(TreeNode cur) {
        if(cur==null)
            return true;
        boolean c2=isValidBST(cur.left);
        if(l< cur.val)
        { boolean c1=true;
            l=cur.val;
            return c1&& c2 && isValidBST(cur.right);
            
        }
            else
            {return false;}
        
        
        
    }
}
