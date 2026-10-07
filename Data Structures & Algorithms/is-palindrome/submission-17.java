class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        int len = s.length();
        while(l < r) {
            while(l < r && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(l)))) {
                l++;
            }
            while(r > l && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(r)))) {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
