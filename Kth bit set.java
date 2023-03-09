class Solution
{
  public static void main(String[]args)
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int k=scan.nextInt();
    if(n&(1<<(k-1))==1)
      System.out.println("Set");
    else
      System.out.println("Not Set");
  }
}
