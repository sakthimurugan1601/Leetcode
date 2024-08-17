class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        char[] ch = s.toCharArray(); 
        
        String str = ""; 
        for (int i = n - 1; i >= 0; i--) {  
            boolean isPalindrome = true;  
            for (int j = 0; j <= i; j++) { 
                if (ch[j] != ch[i - j]) {
                    isPalindrome = false;  
                    break; 
                }
            }
            if (!isPalindrome) {
                str =  str + ch[i]; 
            } else {
                break; 
            }
        }
        
        String a = str + s;
        return a;
    }  
}
