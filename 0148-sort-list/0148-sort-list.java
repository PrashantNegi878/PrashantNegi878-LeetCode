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
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode left=head;
        ListNode right=getMid(head);
        ListNode temp=right.next;
        right.next=null;
        right=temp;
        left=sortList(left);
        right=sortList(right);
        return mergeList(left,right);
    }

    public ListNode getMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode left,ListNode right){
        ListNode tail=new ListNode();
        ListNode dummy=tail;
        while (left!=null && right!=null)
        {
            if(left.val<right.val)
            {
                tail.next=left;
                left=left.next;
            }
            else
            {
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }
        if(left!=null)
        {
            tail.next=left;
        }
        else if(right!=null)
        {
            tail.next=right;
        }
        return dummy.next;
    }
}