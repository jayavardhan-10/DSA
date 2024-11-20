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
            int[] a = new int[n];
            int[] b = new int[n];
            
            
            for(int i=0;i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            
            for(int i=0;i<n; i++)
            {
                b[i] = sc.nextInt();
            }
            
            // int amax = Integer.MIN_VALUE;
            int alicecardindex = -1;
            int alicemax = Integer.MIN_VALUE;
            for(int i=0; i<n; i++)
            {
                int valuenow = Math.max(a[i], b[i]);
                if(valuenow > alicemax)
                {
                    alicemax = valuenow;
                    alicecardindex = i;
                }
            }
            
            //empty the arrays of alice values
            a[alicecardindex] = Integer.MIN_VALUE;
            b[alicecardindex] = Integer.MIN_VALUE;
            
            // repeating the same for bob too
            int bobcardindex = -1;
            int bobmax = Integer.MIN_VALUE;
            for(int i=0; i<n; i++)
            {
                int valuenow = a[i];
                if(valuenow > bobmax)
                {
                    bobmax = valuenow;
                    bobcardindex = i;
                    
                }
                
            }
            
            
            
            
            
            
            if(alicemax > bobmax)
            {
                System.out.println("Yes");
            } else System.out.println("No");
            
            
            
            // int maxindexa = 0;
            // int maxindexa_prev = 0;
            
            
            // int bmax = Integer.MIN_VALUE;
            
            // for(int i=0; i<n ; i++)
            // {
            //     a[i] = sc.nextInt();
            //     if(a[i] > amax){
            //         amax = a[i];
            //         maxindexa_prev = maxindexa;
            //         maxindexa = i;
                    
            //     }
                
            // }
            
            
            // int maxindexb = 0;
            // int maxindexb_prev = 0;
            // for(int i=0; i<n ; i++)
            // {
            //     b[i] = sc.nextInt();
            //     if(b[i] > bmax){
            //         bmax = b[i];
            //         maxindexb_prev = maxindexb;
            //         maxindexb=i;
            //     }
            // }
            
            
            // int alicea = -1;
            // int aliceb = -1;
            // int boba = -1;
            // int bobb = -1;
            // if(amax > bmax)
            // {
            //     alicea = a[maxindexa];
            //     aliceb = a[maxindexa];
            //     a[maxindexa] = Integer.MIN_VALUE;
            //     b[maxindexa] = Integer.MIN_VALUE;
                
                
            // }
            // else if(amax < bmax)
            // {
            //     alicea = a[maxindexb];
            //     aliceb = a[maxindexb];
            //     a[maxindexb] = Integer.MIN_VALUE;
            //     b[maxindexb] = Integer.MIN_VALUE;
                
            // }
            
            // if(a[maxindexa_prev] > b[maxindexb_prev])
            // {
            //     boba = a[maxindexa_prev];
            //     bobb = b[maxindexa_prev];
            // }
            // else
            // {
            //     boba = a[maxindexb_prev];
            //     bobb = a[maxindexb_prev];
            // }
            
            
            // // int bm = 0;
            // // // int am= 0;
            
            // // // alice chooses the biggest b 
            // // for(int i=0; i<n; i++)
            // // {
                
            // //     if(b[i] > b[bm])
            // //     {
            // //         bm = i;
                    
            // //     }
            // // }
            // // alicea = a[bm];
            // // aliceb = b[bm];
            // // a[bm] = -100_000_000;
            // // b[bm] = -100_000_000;
            
            
            
            // // // bob chooses
            // // // bm = 0;
            // // int am = 0;
            // // int boba = -1;
            // // int bobb = -1;
            // // for(int i=0; i<n; i++)
            // // {
                
            // //     if(a[i] > a[am])
            // //     {
            // //         am = i;
                    
            // //     }
            // // }
            // // boba = a[am];
            // // bobb = b[am];
            
            
            
        }
	}
}
