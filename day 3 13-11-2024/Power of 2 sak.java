import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            // int flag = 0;
            long n = sc.nextLong();
            if( n>0 && (n&(n-1)) == 0) System.out.println("True");
            else System.out.println("False");
        }
    }
}