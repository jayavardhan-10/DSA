import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            int flag = 0;
            for(int i=31; i>=0 ; i--)
            // for(int i=0; i<32; i++)
            // here it prints 10 5 2 1 but we dont want to print right to left
            {
                // YOu take 31 to 0 becoz YOU HAVE TO PRINT FROM LEFT TO RIGHT
                int k = n>>i;
                // System.out.println(k);
                
                if((k&1)==1)
                {
                    flag = 1;
                    System.out.print("1");
                }
                else if(flag == 1)
                {
                    System.out.print("0");
                }
            }
            if(flag == 0)
            {
                System.out.println(0);
            }
            System.out.println("over here");
        }


        
    }
}