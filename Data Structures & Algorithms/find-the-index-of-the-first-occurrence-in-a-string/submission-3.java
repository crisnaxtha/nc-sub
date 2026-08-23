class Solution {
    public int strStr(String haystack, String needle) {
        int res = -1;

        int r = 0;
        while(r < haystack.length()) {
            int i = 0;
            int startR = r;
            int tempR = r;
            while(i < needle.length() && tempR < haystack.length()) {
                if(needle.charAt(i) == haystack.charAt(tempR)) {
                    if(i == needle.length() - 1) {
                        return startR;
                    }
                    tempR++;
                    i++;
                } else {
                    break;
                }

            }
            r++;
        }
        return res;

    }
}