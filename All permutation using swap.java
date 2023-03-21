public static void swappermutation(int nums[],int index,List<List<Integer>>ans)
    {
        if(index==nums.length)
        {
            List<Integer>k=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                k.add(nums[i]);
            }
            ans.add(new ArrayList<>(k));
            return ;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            swappermutation(nums,index+1,ans);
            swap(nums,i,index);
        }
    }
    public static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
        return ;
    }
