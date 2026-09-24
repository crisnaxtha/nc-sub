class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    
    public MedianFinder() {
        this.minHeap = new PriorityQueue<>();
        this.maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        this.maxHeap.add(num);
        this.minHeap.add(this.maxHeap.poll());
        if (this.minHeap.size() > this.maxHeap.size()) {
            this.maxHeap.add(this.minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(this.minHeap.size() == this.maxHeap.size()) {
            return (double) (this.maxHeap.peek() + this.minHeap.peek())/ 2;
        } else if(this.minHeap.size() > this.maxHeap.size()) {
            return (double) this.minHeap.peek();
        } else {
            return (double) this.maxHeap.peek();
        }
    }
}
