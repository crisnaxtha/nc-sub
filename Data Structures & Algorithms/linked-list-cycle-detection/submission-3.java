/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        int i = 0;
        while(n1 != null && n2 != null && n2.next != null) {
            if(i != 0 && n1 == n2) {
                return true;
            }
            n1 = n1.next;
            n2 = n2.next.next;
            i++;
        }
        return false;
    }
}
