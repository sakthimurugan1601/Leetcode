import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // Base case: if the current string is complete
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // If we can add an open parenthesis
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        // If we can add a close parenthesis
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }
}
