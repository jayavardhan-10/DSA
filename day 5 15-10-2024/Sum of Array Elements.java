import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            long sum=0;
            for(int i=0; i<n; i++)
            {
                sum+=sc.nextLong();
            }
            System.out.println(sum);
        }
        
    }
}