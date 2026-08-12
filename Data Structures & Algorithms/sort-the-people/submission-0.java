class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] res = new String[names.length];
        Map<Integer, String> map = new HashMap<>();
        int len = heights.length;
        for(int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int j = 0;
        for(int i = len - 1; i >= 0; i--) {
            res[j] = map.get(heights[i]);
            j++;
        }

        return res;
    }
}