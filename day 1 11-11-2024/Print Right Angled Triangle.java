import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int t1=0; t1<t; t1++)
        {
            System.out.println("Case #"+(t1+1)+":");
            int n = sc.nextInt();
            for(int i=0; i<n ; i++)
            {
                for(int j=0; j<(n-i-1);j++)
                {
                    System.out.print(" ");
                }
                for(int j=0; j<(i+1); j++)
                {

                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}