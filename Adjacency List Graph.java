import java.util.*;
public class AdjacencyList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int v=5;
        int e=6;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<e;i++)
        {
            int src= scan.nextInt();
            int dest= scan.nextInt();
            add(adj,src,dest);
        }
    }
    public static void add(ArrayList<ArrayList<Integer>>adj,int src,int dest)
    {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }
}
