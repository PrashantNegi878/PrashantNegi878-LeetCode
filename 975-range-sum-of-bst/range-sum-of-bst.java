/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)  return 0;

        int l=(!(root.val<low))?rangeSumBST(root.left,low,high):0;
        int r=(!(root.val>high))?rangeSumBST(root.right,low,high):0;
        if(root.val>=low && root.val<=high)return l+r+root.val;
        return l+r;
    }
}