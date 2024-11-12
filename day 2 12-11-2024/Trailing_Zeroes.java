import java.io.*;
import java.util.*;
import java.math.*;

public class Trailing_Zeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            
            long n = sc.nextLong();
            // System.out.println(Factorial(n));
            long count = TrailingZeroes(n);

            System.out.println(count);
        }
    }
    public static long TrailingZeroes(long n)
    {
        long count = 0;
        // just keep dividing the number with 5 and add the quetiont to count
        while(n>=5)
        {
            n/=5;
            count+=n;
        }
        return count;
        
    }
}