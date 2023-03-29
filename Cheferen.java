/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0)
		{
		    int n=scan.nextInt();
		    int even=scan.nextInt();
		    int odd=scan.nextInt();
		    int ans=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(i%2==0)
		        ans=ans+even;
		        else
		        ans=ans+odd;
		    }
		    System.out.println(ans);
		    t--;
		}
	}
}
