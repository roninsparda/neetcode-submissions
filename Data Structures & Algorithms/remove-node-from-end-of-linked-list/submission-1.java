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

        if(n ==1 && head != null && head.next == null){
            return null;
        }
        else if(n == 2 && head != null && head.next != null && head.next.next == null){
            head = head.next;
            return head;
        }
        else if(n == 1 &&  head != null && head.next != null && head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode second = new ListNode(-1);
        ListNode current  = head; 
        second.next = head;
        // System.out.println("current "+current.val);
        for(int i= 0 ; i < n;i++){
            
            current = current.next;
            
        }
        //System.out.println("current "+current.val);
        if(current == null){
            return head.next;
        }
        while(current != null){
            current = current.next;
            second = second.next;

        }
        second.next = second.next.next;
        return head;
    }
}
