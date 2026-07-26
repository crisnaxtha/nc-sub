class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        List<Integer> res = new ArrayList<>();

        for(int num : nums1) {
            set1.add(num);

        }

        for(int num : nums2) {
            set2.add(num);
        }

        for(int num: set1) {
            if(set2.contains(num)) {
                res.add(num);
            }
        }

        int[] arrRes = new int[res.size()];
        int i = 0;
        for(int num : res) {
            arrRes[i] = num;
            i++;
        }
        return arrRes;
    }
}