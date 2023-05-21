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
    public int pairSum(ListNode head) {
        ListNode mid=head;
        int l=0,max=Integer.MIN_VALUE;
        while(mid!=null)
        {
            mid=mid.next;
            l++;
        }

        l=l/2;
        mid=head;

        while(l>0)
        {
            mid=mid.next;
            l--;
        }

        ListNode prev=new ListNode(0),curr=mid,next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        while(head!=null && prev!=null)
        {
            max=Math.max(max,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }

        return max;
    }
}