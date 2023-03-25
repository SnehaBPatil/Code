class Solution {
    public void rotate(int[][] m) {
        int l=m[0].length;
        int a[][]=new int[m.length][m[0].length];
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                a[i][j]=m[j][i];
            }
        }
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {   
                m[i][j]=a[i][l-1-j];
                
            }
        }
    }
}
