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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        if(head == null) {
            return null;
        }
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            if(count == m) {
                count = 0;
                int next = n;
                ListNode skip = curr;
                while(next >= 0 && skip != null) {
                   skip = skip.next;
                   next--; 
                }
                curr.next = skip;
            }
            curr = curr.next;
        }
        return head;
    }
}
