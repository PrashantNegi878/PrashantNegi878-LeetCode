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
    public boolean isPalindrome(ListNode head) {
        if (head==null)
            return true;
        int l=0,i=0;
        ListNode temp=head;
        while (temp!=null)
        {
            l+=1;
            temp=temp.next;
        }
        int[] arr = new int[l];
        while (head!=null)
        {
            arr[i]=head.val;
            head=head.next;
            i+=1;
        }
        int j=0;
        i=i-1;
        while(j<i)
        {
            if(arr[j]!=arr[i])
                return false;
            j+=1;
            i-=1;
        }
        return true;       
    }
}