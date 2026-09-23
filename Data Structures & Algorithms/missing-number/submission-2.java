class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;

        int sum1 = 0;
        int sum2 = 0;

        while(len > 0) {
            sum1 += len;
            len--;
        }

        for(int num : nums) {
            sum2 += num;
        }

        return sum1 - sum2;
    
    }
}
