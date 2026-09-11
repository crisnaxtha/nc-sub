class Solution {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String temp = words.get(i);
            for (int j = 0; j < temp.length(); j++) {
                if (j >= words.size() || i >= words.get(j).length() || temp.charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}