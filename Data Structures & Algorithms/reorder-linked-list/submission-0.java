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
    public void reorderList(ListNode head) {

        ListNode fast = head, slow = head, l1 = null, l2 = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        l2 = slow.next;
        slow.next = null;
        l1 = head;
        // reverse l2

        l2 = reverseList(l2);
        
        ListNode mergedList = new ListNode(0);

  
        int n = 1;
        while(l1 != null && l2 != null){
            if(n%2 == 1){
              mergedList.next = l1;
              l1 = l1.next;
            }
            else{
            mergedList.next = l2;
            l2 = l2.next;
            }
            mergedList = mergedList.next;
            n++;
        }
        if(l1 != null){
            mergedList.next = l1;
        }
        if(l2 != null){
            mergedList.next = l2;
        }

    }

    public ListNode reverseList(ListNode head){
        ListNode current = head, nextPointer = null, prevPointer = null;

        while(current != null){
            nextPointer = current.next;
            current.next = prevPointer;
            prevPointer = current;
            current = nextPointer;
        }

        head = prevPointer;
        return head;
    }
}
