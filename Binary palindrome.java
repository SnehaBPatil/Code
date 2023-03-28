    static int isPalindrome( long x)
    {
        long l = 1; 
        long r = (Integer.SIZE/8 )* 8;
     
     
        while (l < r)
        {
            if (isKthBitSet(x, l) != isKthBitSet(x, r))
            {
                return 0;
            }
            l++; r--;
        }
        return 1;
    }
