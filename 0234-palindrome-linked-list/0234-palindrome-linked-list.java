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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverseList(slow.next);
        
        slow = slow.next; 
        
        while(slow!=null){
            if(head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        
        return true;
    }
    
    ListNode reverseList(ListNode temp){
        ListNode prev = null;
        ListNode currNode = temp;
        ListNode nextNode = temp;
        
        while(currNode!=null){
            nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
            
        }
        return prev;
        
    }
    
}