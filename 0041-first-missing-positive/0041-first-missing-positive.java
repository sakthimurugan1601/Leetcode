class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++) {
            if(nums[i] < 0) nums[i] = n+2;
            // else if(nums[i] >= n) nums[i] = n+1;
            else if(nums[i] == 0) nums[i] = n+3;
        }

        for(int i=0; i<n; i++) {
            int val = Math.abs(nums[i]);
            if(val > n) continue;

            if(nums[val-1] > 0) nums[val-1] *= -1;
        }

        int ans = 1;

        for(int i=0; i<n; i++) {
            if(nums[i] > 0) break;
            else ans++;
        }

        return ans;
    }
}