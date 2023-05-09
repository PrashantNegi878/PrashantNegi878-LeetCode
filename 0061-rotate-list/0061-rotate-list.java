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
    public ListNode rotateRight(ListNode head, int k) {

        if(k==0 || head==null || head.next==null)    return head;
        ListNode temp=head;
        int l=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            l++;
        }
        
        k=k%l;
        if(k==0)    return head;
        
        temp.next=head;

        k=l-k;

        while(k>1)
        {
            head=head.next;
            k--;
        }

        temp=head.next;
        head.next=null;

        return temp;
    }
}