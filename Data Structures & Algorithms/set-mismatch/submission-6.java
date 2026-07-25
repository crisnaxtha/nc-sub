class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int first = -1, last = -1;
        int max = -1;
        for(int num : nums) {
            if(set.contains(num)) {
                first = num;
            }
            set.add(num);

            if(max < num) {
                max = num;
            }
        }

        for(int i = 1; i <= max; i++) {
            if(!set.contains(i)) {
                last = i;
            }
        }

        if(max == 1) {
            last = 2;
        }

        return new int[] { first, last};
    }
}