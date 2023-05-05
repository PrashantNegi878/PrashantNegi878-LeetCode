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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();
        boolean carry=false;
        ListNode tempResult=result;
        while (l1!=null || l2!=null)
        {
            int currSum=0;
            if(carry) currSum+=1;
            if(l1!=null){ currSum+=l1.val; l1=l1.next;}
            if(l2!=null){ currSum+=l2.val; l2=l2.next;}
            carry=(currSum>9)?true:false;
            ListNode curr= new ListNode(currSum%10);
            tempResult.next=curr;
            tempResult=tempResult.next;
        }
        if(carry)
        {
            ListNode curr= new ListNode(1);
            tempResult.next=curr;
        }
        
        return result.next;
    }
}