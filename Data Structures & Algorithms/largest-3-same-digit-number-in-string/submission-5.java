class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        int max = Integer.MIN_VALUE;
        int l = 0, r = 1;
        while(r < num.length()) {
            int lchar = num.charAt(l);
            int c = 0;
            while(r < num.length() && lchar == num.charAt(r)) {
                r++;
                c++;
                if(c == 2) break;
            }
            if(c == 2) {
                c = 0;
                int val = Integer.valueOf(num.substring(l, r));
                max = Math.max(max, val);
                if(max == val) {
                    res = num.substring(l, r);
                }
                
            } 
                c = 0;
                l = r;
                r++;
            

        }

        return res;
    }
}