
class Solution {
    TreeNode xpar=null;
    TreeNode ypar=null;
   
  
    public boolean isCousins(TreeNode root, int x, int y) {
        parent(root,x,y);
        int xd=helper(root,x);
        int yd=helper(root,y);
       
        if(xd==yd)
        {
            if(xpar==ypar)
                return false;
            else
                return true;
            
        }
        
        return false;
    }
    public void parent(TreeNode root,int x,int y)
    {
        if(root==null)
            return ;
         if(root.left!=null)
         {
             if(root.left.val==x)
             {xpar=root;}
             else if(root.left.val==y)
             {ypar=root;}
         }
        if(root.right!=null)
        {
            if(root.right.val==x)
            {xpar=root;}
            else if(root.right.val==y)
            {ypar=root;}
        }
        parent(root.left,x,y);
        parent(root.right,x,y);
        
    }
    public int helper(TreeNode root,int x)
    {
 if (root == null)
        return -1;
  

    int dist = -1;
  

    if ((root.val == x)|| 
      
        (dist = helper(root.left, x)) >= 0 || 
          
    
        (dist = helper(root.right, x)) >= 0)
  

        return dist + 1;
          
    return dist;
    }
}
