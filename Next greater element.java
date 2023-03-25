class Solution {
    int c=0;
    public int[] nextGreaterElement(int[] a, int[] b) {
        int ans[]=new int [a.length];
        Stack<Integer>s=new Stack<>();
        
        int i=b.length-1;
        while(i>=0)
        {
            if(s.isEmpty())
            {
                s.push(b[i]);
                find(ans,a,b[i],-1);
                i--;
            }
            else if(b[i] <s.peek())
            {
                find(ans,a,b[i],s.peek());
                s.push(b[i]);
                i--;
            }
            else
            {
                s.pop();
            }
        }
        return ans;
        
    }
    public void find(int []ans,int a[],int p,int q)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==p)
                ans[i]=q;
        }
    }
}
