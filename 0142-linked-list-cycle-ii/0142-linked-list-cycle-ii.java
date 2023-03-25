/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int pos=0;
        Map m=new HashMap();
        while(head!=null)
        {
            if(!m.containsKey(head))
                m.put(head,pos);
            else
                return head;
            pos+=1;
            head=head.next;
        }
        return null;
    }
}