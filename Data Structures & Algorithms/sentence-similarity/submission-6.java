class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for(List<String> similarPair : similarPairs) {
            set.add(similarPair.get(0) + "#" + similarPair.get(1));
        }

        for(int i = 0; i < sentence1.length; i++) {
            String word1 = sentence1[i];
            String word2 = sentence2[i];
            if(!word1.equals(word2)) {
                if(!set.contains(word1 + "#" + word2) && !set.contains(word2 + "#" + word1)) {
                    return false;
                }
            }
        }

        return true;
    }
}