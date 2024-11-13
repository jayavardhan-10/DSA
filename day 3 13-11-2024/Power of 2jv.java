import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int flag = 0;
            long n = sc.nextLong();
            if(n==1)
            {
                System.out.println("True");
                
            }
            else{
                while(n>1)
                {
                    if(n%2 == 1)
                    {
                        // System.out.println("False");
                        flag = 1;
                        break;
                    }
                    n= n/2;
                }
                if(flag==1)
                {
                    System.out.println("False");
                }
                else
                {
                    System.out.println("True");
                }
            }
        }
    }
}