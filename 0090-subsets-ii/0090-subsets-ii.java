class Solution {
    public void solve(int[] nums,List<List<Integer>> result,List<Integer> list,int start){
        result.add(new ArrayList<>(list));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1])
            continue;
            list.add(nums[i]);
            solve(nums,result,list,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        solve(nums,result,list,0);
        return result;
    }
}