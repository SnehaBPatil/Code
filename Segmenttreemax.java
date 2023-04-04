import java.util.*;

public class segmenttreemax {


    public static void main(String[]args) {
        int a[]={8,2,5,1,4,5,3,9,6,10};
        int seg[]=new int[4*a.length];
        build(0, 0, a.length - 1,seg,a);
        int l=3;
        int r=8;
        System.out.println(query(0,0,a.length-1,l,r,seg));
        System.out.println(Arrays.toString(seg));
    }
    public static void build(int ind,int low,int high,int seg[],int a[])
    {
        if(low==high)
        {
            seg[ind]=a[low];
            return ;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid,seg,a);
        build(2*ind+2,mid+1,high,seg,a);
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2] );
    }
    public static int query(int ind,int low,int high,int l,int r,int seg[])
    {
        if(low >=l&& high<=r)
        {
            return seg[ind];

        }
        else if(high<l || low >r)
        {
            return -400;
        }
        else
        {
            int mid=(low+high)/2;
            return Math.max(query(2*ind+1,low,mid,l,r,seg),query(2*ind+2,mid+1,high,l,r,seg));
        }
    }
}
