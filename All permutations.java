import java.util.*;
public class solution {
    public static void main(String args[])  {
        int a[]={1,2,2};
        boolean vis[]=new boolean[a.length];
       List<Integer>k=new ArrayList<>();
       List<List<Integer>>ans=new ArrayList<>();
        helper(a,vis,k,ans);
        System.out.println(ans);

    }
    public static void helper(int a[],boolean vis[],List<Integer>k,List<List<Integer>>ans)
    {
        if(k.size()==a.length) {
            if (!ans.contains(k)) {
                ans.add(new ArrayList<>(k));
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(vis[i]==false)
            {   vis[i]=true;
                k.add(a[i]);
                helper(a,vis,k,ans);
                k.remove(k.size()-1);
                vis[i]=false;
            }
        }
    }
}


