class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            int count = 0;
            int curr = i;
            while(curr > 0) {
                if((curr & 1) == 1) {
                    count++;
                }
                curr = curr >> 1;
            }
            res[i] = count;
        }

        return res;
    }
}
