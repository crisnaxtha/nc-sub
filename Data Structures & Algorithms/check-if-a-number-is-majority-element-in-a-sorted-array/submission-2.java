class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        if(count.get(target) != null && count.get(target)  > nums.length/ 2) {
            return true;
        }
        return false;
    }
}
