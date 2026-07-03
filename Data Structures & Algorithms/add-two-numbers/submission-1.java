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
        int carry = 0;
        ListNode cur = new ListNode(0);
        ListNode current = cur;

        int v1 = (l1 == null) ?0:l1.val;
        int v2 = (l2 == null) ?0:l2.val;
        if(v1 == 0 && v2 == 0){
            return l1;
        }
        while(v1 != 0 || v2 != 0 || carry != 0){
            int sum = v1 + v2 + carry;
            int val = sum%10;
            carry = sum/10;
            cur.next = new ListNode(val);
            cur = cur.next; 
           l1 = (l1 == null)?null:l1.next;
            l2 = (l2 == null)?null:l2.next;
             v1 = (l1 == null) ?0:l1.val;
         v2 = (l2 == null) ?0:l2.val;
        }
      return current.next;
    }
}
