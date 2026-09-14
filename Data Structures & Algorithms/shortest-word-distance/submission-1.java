class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int res = wordsDict.length;

        for(int i = 0; i < wordsDict.length; i++) {
            if(word1.equals(wordsDict[i])) {
                index1 = i;
            }
            if(word2.equals(wordsDict[i])) {
                index2 = i;
            }
            if(index1 != -1 && index2 != -1) {
                int temp = index1 - index2 >= 0 ? index1 - index2 : index2 - index1;
                res = Math.min(res, temp);
            }
        }

        return res;
    }
}
