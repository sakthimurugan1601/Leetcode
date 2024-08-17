public class Solution {
    public String shortestPalindrome(String s) {
        String rev_s = new StringBuilder(s).reverse().toString();
        String new_s = s + "#" + rev_s;
        
        int n = new_s.length();
        int[] lps = new int[n];  // Longest prefix suffix array (KMP table)

        // Build the KMP table
        for (int i = 1; i < n; i++) {
            int j = lps[i - 1];
            
            while (j > 0 && new_s.charAt(i) != new_s.charAt(j)) {
                j = lps[j - 1];
            }
            
            if (new_s.charAt(i) == new_s.charAt(j)) {
                j++;
            }
            
            lps[i] = j;
        }

        // Characters to add in front of the original string to form the palindrome
        String toAdd = rev_s.substring(0, s.length() - lps[n - 1]);
        
        return toAdd + s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aacecaaa";
        System.out.println(solution.shortestPalindrome(s));  // Output: "aaacecaaa"
    }
}
