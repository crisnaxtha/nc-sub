class FirstUnique {
    private int[] nums;

    public FirstUnique(int[] nums) {
        this.nums = nums;
    }
    
    public int showFirstUnique() {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : this.nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : this.nums ) {
            if(map.containsKey(i) && map.get(i) == 1) {
                return i;
            }
        }
        return -1;

    }
    
    public void add(int value) {
        int[] temp = new int[this.nums.length + 1];

        for(int i = 0; i < temp.length; i++) {
            if(i == temp.length - 1) {
                temp[i] = value;
            } else {
                temp[i] = this.nums[i];
            }
        }

        
        this.nums = temp;
        Arrays.stream(this.nums).forEach( i -> {
            System.out.println(i);
        });
        System.out.println("===========>");
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
