import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public void solve(int[] nums, List<List<Integer>> result, int start, int end, Set<List<Integer>> seen) {
        if (start == end) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            if (!seen.contains(list)) {
                result.add(new ArrayList<>(list));
                seen.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i <= end; i++) {
            // Swap
            int temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;

            // Recur
            solve(nums, result, start + 1, end, seen);

            // Swap back
            temp = nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();
        solve(nums, result, 0, nums.length - 1, seen);
        return result;
    }
}
