class Solution {
    public int maxArea(int[] h) {
        int s=0;
        int e=h.length-1;
        int g=-4;
        while(s<e)
        {
            g=Math.max(g,Math.min(h[s],h[e])*(e-s));
            if(h[e]<h[s])
            {
                e--;
            }
            else if(h[e]>h[s])
            s++;
            else
            {
                e--;
                s++;
            }

        }
        return g;
        
    }
}
