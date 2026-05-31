class Solution {
    public boolean confusingNumber(int n) {
        boolean res = false;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);

        int num = n;
        long rem = 0;
        while (num > 0) {
            int temp = num % 10;
            System.out.println(" Actual " + temp);
            if (map.containsKey(temp)) {
                temp = map.get(temp);

            } else {
                return false;
            }

            rem = rem * 10 + temp;
            num = num / 10;
        }

        return rem != n;
    }
}
