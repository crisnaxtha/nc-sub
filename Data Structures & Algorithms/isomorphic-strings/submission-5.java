class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> tset = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(map.containsKey(schar)) {
                if(map.get(schar) != tchar) {
                    return false;
                }
            } else {
                if(tset.contains(tchar)) {
                    return false;
                }
                map.put(schar, tchar);
                tset.add(tchar);
            }
        }
        return true;
    }
}