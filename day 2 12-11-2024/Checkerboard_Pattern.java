import java.util.*;
import java.io.*;

public class Checkerboard_Pattern
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tr=0; tr<t; tr++)
        {
            int n = sc.nextInt();
            System.out.println("Case #"+(tr+1)+":");
            int a = 0;
            
            // int flagi = 1;
            int flagj = 1;
            for(int i=1; i<=n*2; i++)
            {
                if(a==0)
                {
                    // flagi = 2;
                    flagj = 2;  
                }
                else if(a==1)
                {
                    // flagi = 1;
                    flagj = 1;
                }


                for(int j=1; j<=n; j++)
                {
                    if(flagj == 2)
                    {
                        System.out.print("**");
                        flagj = 1;
                    }
                    else if(flagj == 1)
                    {
                        System.out.print("--");
                        flagj = 2;
                    }

                }

                System.out.println("");
                // if(i%2 != 0)
                // {
                //     a=1;
                //     System.out.println(a);
                // }
                if(i%2 == 0)
                {
                    if(a==0)
                    {
                        a=1;
                    }
                    else
                    {
                        a=0;
                    }
                }

                
            }
        }
    }
}
