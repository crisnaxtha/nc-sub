class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int len = s.length();
        while(l < r) {
            while(l < s.length() && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(l)))) {
                l++;
            }
            while(r > 0 && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(r)))) {
                r--;
            }
            if((l < len && r < len) && Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
