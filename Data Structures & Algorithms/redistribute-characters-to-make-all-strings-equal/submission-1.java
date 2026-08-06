class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        int len = words.length;
        for(String word : words) {
            for(char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if(entry.getValue() % len != 0) {
                return false;
            }
        }
        return true;
    }
}