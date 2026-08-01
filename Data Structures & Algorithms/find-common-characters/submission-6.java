class Solution {
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];

        Arrays.fill(count, Integer.MAX_VALUE);

        for(String word : words) {
            int[] curCount = new int[26];

            for(char ch : word.toCharArray()) {
                curCount[ch - 'a']++;
            }

            for(int i = 0; i < 26; i++) {
                count[i] = Math.min(count[i], curCount[i]);
            }
        }

        List<String> res = new ArrayList<>();

        for(int i = 0; i < 26; i ++) {
            for(int j = 0; j < count[i]; j++) {
                res.add(String.valueOf((char) ( i + 'a')));
            }
        }

        return res;

    }
}