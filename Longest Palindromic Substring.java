class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        int max=Integer.MIN_VALUE;
        int in=0;
        int jn=0;
        for(int i=0;i<n;i++)
        {
            dp[i][i]=1;
        }
       for(int i=0;i<n-1;i++)
       {
           if(s.charAt(i)==s.charAt(i+1))
           {dp[i][i+1]=1;
           max=2;
           in=i;
           jn=i+1;}
    
       }
        for(int l=2;l<n;l++)
        { 
            int start=0;
            int end=l;
            while(start<end && end<n)
            {
                if(s.charAt(start)==s.charAt(end) && dp[start+1][end-1]==1)
                {
                    dp[start][end]=1;
                    if(end-start+1 > max)
                    {
                        max=end-start+1;
                        in=start;
                        jn=end;
                    }
                }
                else
                {
                    dp[start][end]=0;
                }
                start++;
                end++;
            }
        }
      return s.substring(in,jn+1);  
    }
}
