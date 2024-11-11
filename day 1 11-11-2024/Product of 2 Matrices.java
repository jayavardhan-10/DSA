import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int[][] a = new int[r1][c1];
            for(int i=0; i<r1; i++)
            {
                for(int j=0; j<c1; j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }

            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] b = new int[r2][c2];
            for(int i=0; i<r2; i++)
            {
                for(int j=0; j<c2; j++)
                {
                    b[i][j] = sc.nextInt();
                }
            }

            // multiplication logic
            if(c1 == r2)
            {

                int[][] c = new int[r1][c2];
                for(int i=0; i<r1; i++)
                {
                    for(int j=0; j<c2; j++)
                    {
                        c[i][j] = 0;
                        for(int k=0; k<r2;k++)
                        {
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                    }
                }
            // printing multiplication
            for(int i=0; i<r1; i++) 
            {
                for(int j=0; j<c2; j++)
                {
                    // c[i][j] = 0;
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
            }

        }

    }
}