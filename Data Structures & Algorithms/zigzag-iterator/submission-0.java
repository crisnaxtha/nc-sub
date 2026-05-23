class ZigzagIterator {
    private Queue<Integer> queue = new ArrayDeque<>();

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        int i = 0;
        List<Integer> v1Temp = new ArrayList<>(v1);
        List<Integer> v2Temp = new ArrayList<>(v2);

        while(v1Temp.size() > i || v2Temp.size() > i) {
            if(v1Temp.size() > i) {
                int temp = v1.get(i);
                queue.offer(temp);
               
            }
            if(v2Temp.size() > i) {
                int temp2 = v2.get(i);
                queue.offer(temp2);
               
            }
            i++;
        }
    }

    public int next() {
        if(this.hasNext()) {
            return queue.poll();
        }
        return -1;
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
