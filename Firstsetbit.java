import java.util.*;
public class Firstsetbit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println(firstsetbit(x));
    }
    public static int firstsetbit(int x)
    {
        return x&(-x);
    }
}
