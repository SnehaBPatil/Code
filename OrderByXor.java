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
	
		int t= scan.nextInt();
		while(t>0)
		{
		    int a=scan.nextInt();
		    int b=scan.nextInt();
		    int c=scan.nextInt();
		    
		    if(a>=c || b>=a || b<=c)
		    {
		        System.out.println(-1);
		    }
		    else{
		        int x=0;
		        int found=-1;
		        while(x<Math.pow(2,30))
		        {
		            if((a^x) <(b^x) && (b^x)<(c^x))
		            { found=1;
		                System.out.println(x);
		                break;
		            }
		            x++;
		        }
		        if(found==-1)
		        System.out.println(-1);
		    }
		    	t--;
		}
	
	}
}
