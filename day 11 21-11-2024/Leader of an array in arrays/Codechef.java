import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++)
		{
		    a[i] = sc.nextInt();
		  //  System.out.println(a[i]);
		}
		for(int i = 0; i<n ; i++)
		{
		int flag  = 0;
		    for(int j=i+1; j<n; j++)
		    {
		        if(a[j] > a[i])
		        {
		            flag = 1;
		          //  break;
		        }
		    }
		    if(flag == 0) System.out.print(a[i]+" ");
		}

	}
}
