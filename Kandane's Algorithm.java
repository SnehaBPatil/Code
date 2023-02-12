class MaximumSubarray {
    public static void main(String[] args) {
        int arr[]={4,-7,8,-10,12,5,8,9};
        System.out.println(maxSubArray(arr));
    }
      public static int maxSubArray(int[] nums) {
        int ma=nums[0];
        int cur=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(cur<0)
            cur=0;
            cur=cur+nums[i];
            ma=Math.max(cur,ma);
        }
        return ma;
    }
}
