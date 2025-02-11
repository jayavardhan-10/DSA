import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t--> 0)
        {
            
            String s = sc.next();
            
            int len = s.length();
            String sol = s.substring(0, len-2) + "i";

            System.out.println(sol);
        }
        
        sc.close();
    }
}