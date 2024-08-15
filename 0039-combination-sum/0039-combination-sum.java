import java.util.ArrayList;
import java.util.List;

class Solution {
    public void solve(int[] candidates, int target, List<List<Integer>> result, List<Integer> list, int i) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || i >= candidates.length) {
            return;
        }

        list.add(candidates[i]);
        solve(candidates, target - candidates[i], result, list, i);

        list.remove(list.size() - 1);
        solve(candidates, target, result, list, i + 1);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(candidates, target, result, list, 0);
        return result;
    }
}
