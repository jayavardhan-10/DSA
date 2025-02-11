import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t--> 0)
        {
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            int len = sb.length();
            sb.delete(len-2, len);

            //appending i into it

            sb.append("i");

            System.out.println(sb);
        }
        
        sc.close();
    }
}