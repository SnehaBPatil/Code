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
		    n=n*1000;
		    int rem=n/2;
		    System.out.println(rem/5);
		    t--;
		}
	}
}
