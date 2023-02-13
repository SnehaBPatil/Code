class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int a,b;
        int e=nums.length-1;
        if(nums.length<2)
           return nums;
        while(s<e)
        {
            a=nums[s];
            b=nums[e];
            if(a%2!=0 && b%2==0)
            {
                nums[s]=b;
                nums[e]=a;
                s++;
                e--;
            }
            else if(a%2==0 && b%2==0)
            {
                s++;
            }
            else if(a%2!=0 && b%2!=0)
            {
                e--;
            }
            else
            {
                s++;
                e--;
            }
        }
        return nums;
    }
}
