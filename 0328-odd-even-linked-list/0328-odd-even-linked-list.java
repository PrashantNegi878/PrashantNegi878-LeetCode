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
    public ListNode oddEvenList(ListNode head) {
        ListNode oHead = new ListNode();
        ListNode eHead = new ListNode();
        ListNode tempeHead = eHead;
        ListNode tempoHead = oHead;        
        int i = 1;
        while(head!=null)
        {
            if(i%2==0)
            {
                tempeHead.next=head;
                tempeHead=tempeHead.next;
            }
            else{
                tempoHead.next=head;
                tempoHead=tempoHead.next;
            }
            head=head.next;
            i++;
        }
        tempeHead.next = null;
        tempoHead.next=eHead.next;
        return oHead.next; 
    }
}