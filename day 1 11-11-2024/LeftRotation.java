import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rot = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int r=0; r<rot; r++)
        {
            int temp = a[0];
            for(int i=0; i<n-1; i++)
            {
                a[i] = a[i+1];
            }
            a[n-1] = temp;
        }
        // priting the final array
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
