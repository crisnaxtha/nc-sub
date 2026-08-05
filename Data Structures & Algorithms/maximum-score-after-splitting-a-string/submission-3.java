class Solution {
    public int maxScore(String s) {
        int res = Integer.MIN_VALUE;

        for(int i = 0; i < s.length() - 1; i++) {
            String left = s.substring(0, i + 1);

            String right = s.substring(i + 1, s.length());
            System.out.println(right);
            int l = 0;
            int lc = 0;
            while(l < left.length()) {
                if(left.charAt(l) == '0') {
                    lc++;
                }
                l++;
            }
            int r = 0;
            int rc = 0;
            while(r < right.length()) {
                if(right.charAt(r) == '1') {
                    rc++;
                }
                r++;
            }

            res = Math.max(res, lc + rc);
        }

        return res;
    }
}