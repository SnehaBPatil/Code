class Solution {
    public int countPairs(int[] a, int k) {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j] && i*j %k==0)
                 count++;
            }
        }
        return count;
    }
}
