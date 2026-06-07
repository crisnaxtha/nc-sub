class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();
       
        for(int digit : digits) {
            str.append(String.valueOf(digit));
        }
        long number = Long.parseLong(str.toString()) + 1;
        System.out.println(number);
        String resDigits = String.valueOf(number);
        System.out.println("Res Digits "  + resDigits);
        int[] res = new int[resDigits.length()];
        int i = 0;
        for(char ch : resDigits.toCharArray()){
            res[i] = (int) ch - '0';
            i++;
        }
        return res;
    }
}
