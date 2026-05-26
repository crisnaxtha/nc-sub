class Solution {
    public boolean isPathCrossing(String path) {
        boolean res = false;
        int x = 0;
        int y = 0;

        Set<String> set = new HashSet<>();
        set.add(x + "+" + y);

        for(char ch : path.toCharArray()) {
            if(ch == 'N') {
                y++;
            } else if(ch == 'S') {
                y--;
            } else if(ch == 'E') {
                x++;
            } else {
                x--;
            }

            if(set.contains(x + "+" + y)) {
                return true;
            }
            set.add(x + "+" + y);
        }
        return res;
    }
}