class Solution {
    public boolean validWordSquare(List<String> words) {
        boolean res = true;
        int n = words.size();
        int m = words.get(0).length();
  

        for (int c = 0; c < m; c++) {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < n; r++) {
               if( c < words.get(r).length()) {
                sb.append(words.get(r).charAt(c));
               }
            }

            System.out.println(sb.toString());

            if(!sb.toString().equals(words.get(c))) {
                return false;
            }

          
        }

        return res;
    }
}
