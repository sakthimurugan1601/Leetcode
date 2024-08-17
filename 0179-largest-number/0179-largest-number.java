

class Solution {
    public String largestNumber(int[] numbers) {

        String[] numStrings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStrings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(numStrings, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));
        StringBuilder largestNumber = new StringBuilder();
        for (String num : numStrings) {
            largestNumber.append(num);
        }
        String result = largestNumber.toString();
        return result.charAt(0) == '0' ? "0" : result;
        //return result;

    }
}
