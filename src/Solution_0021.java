/**
 * 0021. Merge Two Sorted Lists
 * Difficulty : Easy
 */
/* ----------------------------------------------------*/
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
class Solution_0021 {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1 == null) {
            return head2;
        }
        if(head2 == null) {
            return head1;
        }

        if(head1.val < head2.val) {
            head1.next = mergeTwoLists(head1.next, head2);
            return head1;
        }
        else {
            head2.next = mergeTwoLists(head2.next, head1);
            return head2;
        }
    }
}