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
    public int maxAncestorDiff(TreeNode root) {
        return findMaxDiff(root,root.val,root.val);
    }

    public int findMaxDiff(TreeNode root,int max, int min) {
        if(root==null)  return 0;
        max=Math.max(root.val,max);
        min=Math.min(root.val,min);
        int curr=max-min;
        int l=findMaxDiff(root.left,max,min);
        int r=findMaxDiff(root.right,max,min);
        return Math.max(Math.max(l,r),curr);
    }

}