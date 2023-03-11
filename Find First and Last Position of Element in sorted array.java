class Solution {
    public static int[] searchRange(int[] a, int t) {
        int ans[]=new int[2];
        if(a.length==0)
         return new int[]{-1,-1};
        ans[0]=search(a,t,true);
        ans[1]=search(a,t,false);
        return ans;
        
    }
    public static int search(int a[],int t, boolean f)
    {int mid=0,s=0,e=a.length-1;
    int ans=-1;
    while(s<=e)
    {    
     mid=s+(e-s)/2;
     if(a[mid] > t)
        {
            e=mid-1;
        }
        else if(a[mid] <t)
        s=mid+1;
        else
        {ans=mid;
            if(f==true)
              e=mid-1;
            else
            s=mid+1;
        }
       
    }
    
         return ans;
    }
   
}
