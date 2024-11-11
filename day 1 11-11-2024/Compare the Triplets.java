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
        int[] a = new int[3];
        int[] b = new int[3];
        int as = 0;
        int bs = 0;
        for(int i=0; i<3; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<3; i++)
        {
            b[i] = sc.nextInt();
        }
        
        
        for(int i=0; i<3; i++)
        {
            if(a[i]>b[i])
            {
                as +=1;
            }
            else if(a[i]<b[i])
            {
                bs +=1;
            }
        }
        
        System.out.println(as+" " +bs);
        
        

    }
}
