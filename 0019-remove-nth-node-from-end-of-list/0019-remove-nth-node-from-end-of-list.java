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
        if(head == null) return null;
        if(head.next == null && n==1) return null;
        if(head.next.next == null && n==2) return head.next;
        if(head.next.next == null && n==1){
            head.next = null;
            return head;
        }
        
        ListNode curr = head;
        ListNode temp = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        int end = count - n;
        if(end == 0){
            return head.next;
        }
        int loop = 1;
        while(temp!=null && loop<end){
            temp = temp.next;
            loop++;
        }
        temp.next = temp.next.next;
        return head;
        
        
    }
}