public class Catalannumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(catalan(n));
    }
    public static int catalan(int n)
    {
        if(n<=1)
            return 1;
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=res+catalan(i)+catalan(n-i-1);
        }
        return res;
    }
    static int catalanDP(int n)
    {
        int catalan[] = new int[n + 2];

       
        catalan[0] = 1;
        catalan[1] = 1;

        
        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i]
                        += catalan[j] * catalan[i - j - 1];
            }
        }
        
        return catalan[n];
    }
}
