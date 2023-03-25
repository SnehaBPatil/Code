class Solution {
    int flag=0;
    Node temp=null;
    public Node connect(Node root) {
    int h = height(root);
        int i;
        for (i = 2; i <= h; i++)
           { printCurrentLevel(root, i);
           flag=0;
           temp=null;
           }
        return root;
        
    }
    public static int height(Node root)
    {
        if (root == null)
            return 0;
        else {
           
            int lheight = height(root.left);
            int rheight = height(root.right);
 
           
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
    void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            {if(flag==0)
                {temp=root;
                flag=1;}
                else
               { temp.next=root;
                temp=root;}
                System.out.print(root.val + " ");}
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
    
}
