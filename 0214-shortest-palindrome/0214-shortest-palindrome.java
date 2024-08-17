class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        String rev=sb.toString();
        for(int i=0;i<s.length();i++){
           if(s.startsWith(rev.substring(i))){
            return rev.substring(0, i)+s;
           }
        }
        return "";
    }
}