class Solution {
    public int minOperations(String s) {
        int zeroRes = 0;
        int oneRes = 0;

        if(s.length() == 1) {
            return 0;
        }


        for(int i = 0; i < s.length(); i++) {
            char expectedForZeroStart = (i % 2 == 0) ? '0' : '1';
            char expectedForOneStart = (i % 2 == 0) ? '1' : '0';
            
            if(s.charAt(i) != expectedForZeroStart) {
                zeroRes++;
            }
            if(s.charAt(i) != expectedForOneStart) {
                oneRes++;
            }
        }
        return Math.min(zeroRes, oneRes); 
    }
}