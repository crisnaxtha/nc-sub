class Solution {
    public int findJudge(int n, int[][] trust) {
        int judge = trust[0][1];
        Set<String> set = new HashSet<>();
        if(judge > n || judge < 0) {
            return -1;
        }
        for(int[] p : trust) {
            if(p[0] == judge || (p[1] != judge && !set.contains(p[0] + "#" + judge))) {
                return -1;
            }
            set.add(p[0] + "#" + p[1]);
        }
        return judge; 
    }
}