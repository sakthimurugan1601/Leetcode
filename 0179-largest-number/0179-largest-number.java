class Solution {
    public String largestNumber(int[] nums) {
        String s []= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
for (int i = 0; i < s.length; i++) {
    for (int j = i + 1; j < s.length; j++) {
        String c1 = s[i] + s[j];
        String c2 = s[j] + s[i];
        if (c1.compareTo(c2)< 0){
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
           if (s[0].equals("0")) {
           return "0";
        }
        String result = "";
         for (String str : s) {
         result += str;
       }
        return result;
    }
}