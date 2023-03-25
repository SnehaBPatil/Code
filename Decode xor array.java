class Solution {
    public int[] decode(int[] encoded, int first) {
        int []d=new int[encoded.length+1];
        d[0]=first;
        for(int i=1;i<d.length;i++)
    {
        d[i]=d[i-1]^encoded[i-1];

    }
    return d;
    }
}
