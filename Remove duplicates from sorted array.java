class Solution {
    public int removeDuplicates(int[] nums) {
        int a=Integer.MAX_VALUE;
        int k=nums[0];
        int cur=1;
        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            if(k==nums[i])
            {
                cur++;
                if(cur>2)
                {
                    nums[i]=a;
                    count++;
                }
            }
                else
                {
                    k=nums[i];
                    cur=1;
                }
            }
        
        Arrays.sort(nums);
        int n=nums.length-count;
        return n;
        
    }
}
