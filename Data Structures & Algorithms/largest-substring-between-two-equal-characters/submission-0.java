class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1; 
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
            }
        }

        for(char ch : set) {
            int fIdx = s.indexOf(ch);
            int lIdx = s.lastIndexOf(ch);
            if(lIdx > fIdx) {
                int temp = lIdx - fIdx - 1;
                max = Math.max(temp, max);
            }
        }

        return max;
    }
}