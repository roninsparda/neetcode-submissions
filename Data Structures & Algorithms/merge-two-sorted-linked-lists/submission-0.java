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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1, current2 = list2, newList = null, head = null;

        if(current1 == null && current2 == null){
            return null;
        }
        else if(current1 == null ){
            return current2;
        }
        else if(current2 == null){
            return current1;

        }
        else{
        if(current1.val <= current2.val){
            head = current1;
            newList = current1;
            current1 = current1.next;

        }
        else{
            head = current2;
            newList = current2;
            current2 = current2.next;
        }


        while(current1 != null && current2 != null){
            if(current1.val <= current2.val){
                
                newList.next = current1;
                newList = newList.next;
                current1 = current1.next;
            }
            else{
               
                newList.next = current2;
                 newList = newList.next;
                current2 = current2.next;
            }
        }

        while(current1 != null){
            newList.next = current1;
                newList = newList.next;
                current1 = current1.next;
        }
        while(current2 != null){
            newList.next = current2;
                 newList = newList.next;
                current2 = current2.next;
        }
        }
        return head;
    }
}