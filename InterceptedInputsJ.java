


import java.util.*;
import java.io.*;

public class InterceptedInputsJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder oput = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine()); // Number of inputs
            String[] iputs = br.readLine().split(" "); // Read the shuffled inputs
            
            int[] ar = new int[k];
            for (int i = 0; i < k; i++) {
                ar[i] = Integer.parseInt(iputs[i]);
            }
            
            Arrays.sort(ar); // Sort the array to identify n and m
            
            int n = 0, m = 0;
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    // Check if arr[i] * arr[j] matches k
                    if (ar[i] * ar[j] == k) {
                        n = ar[i];
                        m = ar[j];
                        break;
                    }
                }
                if (n != 0 && m != 0) break;
            }
            
            oput.append(n).append(" ").append(m).append("\n");
        }
        
        System.out.print(oput);
    }
}
