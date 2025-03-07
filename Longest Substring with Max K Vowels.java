import java.util.*;

public class Main {
    static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    static int longestSubstringWithKVowels(int k, String s) {
        int maxLen = 0, left = 0, vowelCount = 0;

        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                vowelCount++;
            }

            while (vowelCount > k) {
                if (isVowel(s.charAt(left))) {
                    vowelCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();
            String S = sc.next();
            System.out.println(longestSubstringWithKVowels(K, S));
        }

        sc.close();
    }
}
