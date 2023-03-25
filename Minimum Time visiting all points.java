class Solution {
    public int minTimeToVisitAllPoints(int[][] a) {
        int count=0;
        for(int i=1;i<a.length;i++)
        {
            count=count+(Math.max(Math.abs(a[i-1][0]-a[i][0]),Math.abs(a[i-1][1]-a[i][1])));
        }
        return count;
        
    }
}
