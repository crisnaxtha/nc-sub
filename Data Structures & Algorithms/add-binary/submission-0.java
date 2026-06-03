class Solution {
    public String addBinary(String a, String b) {
        char carryOver = '0';
        String res = "";
        int up = a.length() - 1;
        int dw = b.length() - 1;
        StringBuilder strb = new StringBuilder();
        while (up >= 0 || dw >= 0 || carryOver == '1') {
            char charA = up >= 0 ? a.charAt(up) : '0';
            char charB = dw >= 0 ? b.charAt(dw) : '0';
            char temp = ' ';
            char tempCarryOver = '0';
            if (charA == '0' && charB == '0') {
                temp = '0';
                if (carryOver == '1') {
                    temp = '1';
                }
            } else if (charA == '1' && charB == '0') {
                temp = '1';
                if (carryOver == '1') {
                    temp = '0';
                    tempCarryOver = '1';
                }
            } else if (charA == '0' && charB == '1') {
                temp = '1';
                if (carryOver == '1') {
                    temp = '0';
                    tempCarryOver = '1';
                }
            } else {
                temp = '0';
                tempCarryOver = '1';
                if (carryOver == '1') {
                    temp = '1';
                }
            }
            strb.append(temp);
            carryOver = tempCarryOver;
            up--;
            dw--;
        }

        return strb.reverse().toString();
    }
}