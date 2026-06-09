class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = this.head.next;
        while(curr != null) {
            if(i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode curr = this.head;
        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        curr.next = newNode;
        if(newNode.next == null) {
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        ListNode newNode = new ListNode(val);
        this.tail.next = newNode;
        this.tail = newNode;

    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while(curr != null && i < index) {
            curr = curr.next;
            i++;
        }

        if(curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while(curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
