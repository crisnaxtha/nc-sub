class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        Map<String, List<String>> annaMap = new HashMap<>();

        for(String str : strs) {
            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar);
            String temp = new String(tempChar);

            if(annaMap.get(temp) == null) {
                annaMap.put(temp, new ArrayList<>());
            } 
            List<String> tempList = annaMap.get(temp);
            tempList.add(str);
            annaMap.put(temp, tempList);
        }

        for(Map.Entry<String, List<String>> en : annaMap.entrySet()) {
            res.add(en.getValue());
        }

        return res;
    }
}
