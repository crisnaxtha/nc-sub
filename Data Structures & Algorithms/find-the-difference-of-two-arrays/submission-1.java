class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }

        for(int num : nums2) {
            set2.add(num);
        }

        Set<Integer> dist1 = new HashSet<>();
        Set<Integer> dist2 = new HashSet<>();

        for(int num : nums1) {
            if(!set2.contains(num)) {
                dist1.add(num);
            }
        }

        for(int num : nums2) {
            if(!set1.contains(num)) {
                dist2.add(num);
            }
        }

        return List.of(new ArrayList<>(dist1), new ArrayList<>(dist2));
    }
}