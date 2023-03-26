 public static int helper(int h[],int index)
    {
        if(index==0)
            return 0;
        int left;
        int right=Integer.MAX_VALUE;
        left=helper(h,index-1)+Math.abs(h[index]-h[index-1]);
        if(index>1)
            right=helper(h,index-2)+Math.abs(h[index]-h[index-2]);
        return Math.min(right,left);

    }
