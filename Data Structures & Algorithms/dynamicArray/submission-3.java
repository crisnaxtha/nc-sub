class DynamicArray {
    private int[] arr;
    private int size;
    private int cap;

    public DynamicArray(int capacity) {
        this.cap = capacity;
        this.arr = new int[this.cap];
        this.size = 0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }   

    public void pushback(int n) {
        if(this.size == this.cap) {
            this.resize();
        } 
        this.arr[this.size] = n;
        this.size += 1;
    }

    public int popback() {
        int temp = this.arr[this.size - 1];
        this.arr[this.size - 1] = 0;
        this.size -= 1;
        return temp;
    }

    private void resize() {
        this.cap = 2 * this.cap;
        int[] new_arr = new int[this.cap];
        for(int i = 0; i < this.size; i++) {
            new_arr[i] = this.arr[i];
        }
        this.arr = new_arr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.cap;
    }
}
