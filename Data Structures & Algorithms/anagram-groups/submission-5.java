class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String str : strs) {
            String sortedString = sortString(str);
            if(map.containsKey(sortedString)) {
                List<String> strList = map.getOrDefault(sortedString, new ArrayList<>());
                strList.add(str);
                map.put(sortedString, strList);
            } else {
                List<String> newStrList = new ArrayList<>();
                newStrList.add(str);
                map.put(sortedString, newStrList);
            }
        }

        for(List<String> strList : map.values()) {
            res.add(strList);
        }

        return res;
    }

    String sortString(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
