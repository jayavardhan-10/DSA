import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tt=0; tt<t; tt++)
        {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            // for(int i=0; i<n; i++)
            // {
            //     for(int j=0; j<n ; j++)
            //     {
            //         a[i][j] = sc.nextInt();
            //     }
            // }

            // printing the rotated matrix
            for(int i=n-1; i>=0; i--)
            {
                for(int j=n-1; j>=0; j--)
                {
                    a[j][i] = sc.nextInt();
                }
            }

            System.out.println("Test Case #"+ (tt+1) +":");
            for(int i=n-1; i>=0; i--)
            {
                for(int j=0; j<n ; j++)
                {
                    // a[i][j] = sc.nextInt();
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }



            
        }
    }
}