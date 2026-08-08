class Solution {
    public int longestPalindrome(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        } // count characters
        int oddFound = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if(count % 2 == 0) {
                res += count;
            } else {
                res += count - 1;
                oddFound = 1;
            }
        }

        return res + oddFound;
    }
}