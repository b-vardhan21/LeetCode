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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int leading = 0, newValue = 0;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int num = 0;
        while(l1 != null && l2 != null){ 
            num = l1.val + l2.val+leading;
            leading = 0;
            if(num>=10){
                leading = 1;
                newValue = num - 10;
                curr.next = new ListNode(newValue);
            }
            else{
                newValue = num;
                curr.next = new ListNode(newValue);
            }
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        while(l1!=null){
            num = l1.val + leading;
            leading = 0;
            if(num>=10){
                leading = 1;
                newValue = num - 10;
                curr.next = new ListNode(newValue);
            }
            else{
                newValue = num;
                curr.next = new ListNode(newValue);
            }
            l1 = l1.next;
            curr = curr.next;
        }
        while(l2!=null){
            num = l2.val + leading;
            leading = 0;
            if(num>=10){
                leading = 1;
                newValue = num - 10;
                curr.next = new ListNode(newValue);
            }
            else{
                newValue = num;
                curr.next = new ListNode(newValue);
            }
            l2 = l2.next;
            curr = curr.next;
        }
        if(num>=10){
            leading = 1;
            curr.next = new ListNode(leading);
            
        }
        return res.next;
    }
}