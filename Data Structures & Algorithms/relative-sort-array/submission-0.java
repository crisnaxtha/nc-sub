class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        List<Integer> exc = new ArrayList<>();
        for(int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : arr2) {
            set.add(num);
        }

        for(int num : arr2) {
            if(map.containsKey(num)) {
                int temp = map.get(num);
                while(temp > 0) {
                    res.add(num);
                    temp--;
                }
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(!set.contains(entry.getKey())) {
                int temp2 = entry.getValue();
                while(temp2 > 0) {
                    exc.add(entry.getKey());
                    temp2--;
                }
            }
        }

        Collections.sort(exc);
        for(int n : exc) {
            res.add(n);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}