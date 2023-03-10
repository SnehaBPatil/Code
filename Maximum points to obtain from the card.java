class Solution {
    public int maxScore(int[] n, int k) {
        int e=n.length-k;
        int s=0;
        int g=0;
        int sum=0;
        for(int i=e;i<n.length;i++)
        {
            sum=sum+n[i];
        }
        g=sum;
        while(e!=n.length)
        {
            sum=sum-n[e]+n[s];
            g=Math.max(g,sum);
            e++;
            s++;
        }
        return g;
        
    }
}
