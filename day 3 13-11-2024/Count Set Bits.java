import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {

            long input = sc.nextLong();
            long count=0;
            while(input!=0)
            {
                count++;
                input = input & (input-1);

                // other type of solving
                // if(input & 1 == 1)
                // {
                //     count++;
                // }
                // input = input>>1;
            }

            
            // String bit = Long.toBinaryString(input);
            System.out.println(count);
            // while(bit>)

        }
    }
}