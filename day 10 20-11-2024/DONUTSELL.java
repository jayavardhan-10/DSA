import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] arrn = new int[n];
            for(int i=0; i<n ; i++)
            {
                arrn[i] = sc.nextInt();
            }
            
            int[] arrm = new int[m];
            for(int i=0; i<m ; i++)
            {
                arrm[i] = sc.nextInt();
            }
            
            // writing the logic
            int sad = 0;
            // iterate over customers
            for(int i=0; i<m; i++)
            {
                if(arrn[arrm[i]-1] > 0) arrn[arrm[i]-1]--;
                else sad++;
            }
            System.out.println(sad);
            
            
        //   t is done now
        }//
	}
}
