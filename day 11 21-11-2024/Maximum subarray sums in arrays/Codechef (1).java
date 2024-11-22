import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
    		int n = sc.nextInt();
    		int[] a = new int[n];
    // 		int sum = 0;
    		for(int i = 0; i< n ;i++)
    		{
    		    a[i] = sc.nextInt();
    		  //  sum+=sc.nextInt();
    		}
    		
    		int maxsum = Integer.MIN_VALUE;
    		for(int i=0; i<n; i++)
    		{
    		    for(int j=i;j<n; j++)
    		    {
    		        int sum = 0;
    		        for(int k=i; k<=j ; k++)
    		        {
    		            sum+=a[k];
    		        }
    		        maxsum = Math.max(maxsum, sum);
    		    }
    		}
    		
    		System.out.println(maxsum);
		}

	}
}
