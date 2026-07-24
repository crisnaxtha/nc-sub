class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        Arrays.stream(nums).forEach(e -> {
            System.out.println(e);
        });
        return (nums[nums.length - 1] * nums[nums.length - 2] ) - (nums[0] * nums[1]);

    }
}