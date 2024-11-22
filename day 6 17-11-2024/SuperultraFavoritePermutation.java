import java.util.*;
import java.io.*;

public class SuperultraFavoritePermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder op = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            
            if (n == 2) {
                op.append("1 2\n");
                continue;
            }
            
            
            if (n == 3) {
                op.append("-1\n");
                continue;
            }
            
            
            List<Integer> rslt = new ArrayList<>();
            
            
            for (int i = n; i >= 1; i--) {
                if (i % 2 != 0) {
                    rslt.add(i);
                }
            }
            
            
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    rslt.add(i);
                }
            }
            
            
            for (int num : rslt) {
                op.append(num).append(" ");
            }
            op.append("\n");
        }
        
        
        System.out.print(op);
    }
}
