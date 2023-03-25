class Solution {
    public int findCenter(int[][] a) {
        int m=a[0][0];
        int n=a[0][1];
        int c=0;
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(a[i][j]==m)
                    c=m;
                else if(a[i][j]==n)
                    c=n;
                
                    
            }
        }
        return c;
        
    }
}
