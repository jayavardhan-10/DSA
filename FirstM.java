import java.util.Scanner;



public class FirstM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();
        int[] Ar = new int[tc];
        
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt(); 
            int[] a = new int[n];
            int[] f = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                f[a[i]]++;
            }
            
            int score = 0;
            for (int i = 1; i <= n; i++) {
                score += f[i] / 2;
            }
            
            Ar[t] = score;
        }
        
        for (int j : Ar) {
            System.out.println(j);
        }
    }
}
