import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int p[]={40,10,50,90};
        int w[]={10,20,40,30};
        int weight=60;
        System.out.println(recurrsion(p,w,weight,p.length));

    }
    public static int recurrsion(int p[],int w[],int weight,int n)
    {
        if(n==0 || weight==0)
            return 0;
        if(w[n-1]>weight)
            return recurrsion(p,w,weight,n-1);
        else {
            return Math.max(p[n-1]+recurrsion(p,w,weight-w[n-1],n-1),recurrsion(p,w,weight,n-1));
        }
    }
}
