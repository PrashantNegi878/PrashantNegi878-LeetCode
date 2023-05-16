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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)  return head;
        ListNode result=head.next;
        ListNode curr=head,nxt=head.next,prev=new ListNode(0);
        boolean flag=true;
        while(nxt!=null)
        {
            swapNodes(prev,curr,nxt);
            prev=curr;
            curr=curr.next;
            if(curr!=null)nxt=curr.next;
            else break;
            flag=!flag;
        }
        return result;
    }

    public void swapNodes(ListNode prev,ListNode curr, ListNode nxt)
    {
        curr.next=nxt.next;
        nxt.next=curr;
        prev.next=nxt;
    }
}