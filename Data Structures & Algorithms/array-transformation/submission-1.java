class Solution {
    public List<Integer> transformArray(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for(int num : arr) {
            res.add(num);
        }
        if(res.size() <= 2) {
            return res;
        }

        boolean flag = false;
        do {
            flag = false;
            List<Integer> prev = new ArrayList<>(res);
            for(int i = 1; i < res.size() - 1; i++) {
                int temp = prev.get(i);
                if(prev.get(i - 1) > prev.get(i) && prev.get(i + 1) > prev.get(i)) {
                    res.set(i, temp + 1);
                    flag = true;
                } else if(prev.get(i - 1) < prev.get(i) && prev.get(i + 1) < prev.get(i)) {
                    res.set(i, temp - 1);
                    flag = true;
                }
            }
        } while(flag);
        return res;
    }
}
