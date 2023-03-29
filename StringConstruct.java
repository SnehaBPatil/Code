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
		while(t-->0)
		{
		    int n=scan.nextInt();
		    String u=scan.next();
		    char []res=new char[n];
		    int i=0;
		    int idx=0;
		    while(i<n)
		    {
		        char c=u.charAt(i);
		        int j=i+1;
		        while(j<n && u.charAt(j)==c)
		        {
		            j++;
		        }
		        int len=j-i;
		        if(len%2==1)
		        {
		            res[idx++]=c;
		        }
		        else
		        {
		            res[idx++]=c;
		            res[idx++]=c;
		        }
		        i=j;
		    }
		    System.out.println(new String(res,0,idx));
		}
	}
}
