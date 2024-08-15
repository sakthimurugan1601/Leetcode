import java.util.ArrayList;
import java.util.List;

class Solution {
    public void solve(int[] nums, List<List<Integer>> result, List<Integer> list, int i) {
        if (i == nums.length) {
            result.add(new ArrayList<>(list));  // Fixed typo here
            return;
        } else {
            // Include nums[i] in the subset
            list.add(nums[i]);
            solve(nums, result, list, i + 1);
            
            // Exclude nums[i] from the subset
            list.remove(list.size() - 1);
            solve(nums, result, list, i + 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(nums, result, list, 0);
        return result;
    }
}
