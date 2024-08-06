class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int step1 = (numRows * 2) - 2;
            int step2 = i * 2;

            for (int j = i; j < n; j += step1) {
                sb.append(s.charAt(j));

                if (step2 > 0 && step2 < step1 && j + step1 - step2 < n) {
                    sb.append(s.charAt(j + step1 - step2));
                }
            }
        }

        return sb.toString();
    }
}