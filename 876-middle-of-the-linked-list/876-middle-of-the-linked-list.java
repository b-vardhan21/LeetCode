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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        int half = 0;
        ListNode curr = head;
        ListNode temp = head;
        ListNode temp1 = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        half = count/2+1;
            int c = 1;
            while(temp1!=null){
                if(c<half){
                    temp = temp.next;
                }
                temp1 = temp1.next;
                c++;
            }
        return temp;  
        
    }
}