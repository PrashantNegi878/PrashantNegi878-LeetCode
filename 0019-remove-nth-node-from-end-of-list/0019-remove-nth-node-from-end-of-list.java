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
        if (head==null || head.next==null)
            return null;
        ListNode rNode = head;
        ListNode temp = head;
        for(int i=0;i<n;i++)
            rNode=rNode.next;
        if(rNode==null)
            return head.next;
        while(rNode.next!=null)
        {
            temp=temp.next;
            rNode=rNode.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}