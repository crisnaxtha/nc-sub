class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        int len = nums.length;
        if(len == 0) {
            res.add(List.of(lower, upper));
            return res;
        }
        while (i <= len) {
            List<Integer> temp = new ArrayList<>();
            if (i == 0) {
                if (lower < nums[i]) {
                    temp.add(lower);
                    temp.add(nums[i] - 1);
                }
            } else if (i < len) {
                if (nums[i - 1] + 1 < nums[i]) {
                    temp.add(nums[i - 1] + 1);
                    temp.add(nums[i] - 1);
                }
            } else if (i == len) {
                if (nums[i - 1] < upper) {
                    temp.add(nums[i - 1] + 1);
                    temp.add(upper);
                }
            }
            if(!temp.isEmpty()) {
                res.add(temp);
            }
            i++;
        }
        return res;
    }
}
