import java.util.*;
public class Graph {
    public static void main(String[] args) {
        int v=5;
        int e=6;
        Scanner scan=new Scanner(System.in);
        int adj[][]=new int[v+1][v+1];
        for(int i=0;i<e;i++)
        {
            int src=scan.nextInt();
            int dest=scan.nextInt();
            add(adj,src,dest);
        }
        display(adj);
    }
    public static void add(int [][]adj,int src,int dest)
    {
        adj[src][dest]=1;
        adj[dest][src]=1;
    }
    public static void display(int [][]adj)
    {
        for(int i=1;i<adj.length;i++)
        {
            for(int j=1;j<adj[i].length;j++)
                System.out.print(adj[i][j]+" ");
            System.out.println();
        }
    }


}
