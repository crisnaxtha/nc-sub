class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int res = -1;

        Map<Integer, Integer> map = new HashMap<>();
        int l = 0, r=0;
        while(l < nums.length) {
            r = l + 1;
            while(r < nums.length) {
                if(l < r && nums[l] + nums[r] < k) {
                    res = Math.max(res, nums[l] + nums[r]);
                }
                r++;
            }
            l++;
        }
        return res;
    }
}
