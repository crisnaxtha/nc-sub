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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        int i = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = prev;
        ListNode currAgain = dummy;
        while(currAgain.next != null) {
            if(i == n ) {
                currAgain.next = currAgain.next.next;
                break;
            }
            currAgain = currAgain.next;
            i++;
        }
        

        curr = dummy.next;
        prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
