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
    int min=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
       findMin(root,min);
       return min;
    }

    public int findMin(TreeNode root,int prev) {
         if(root == null){
            return prev;
        }
        prev=findMin(root.left,prev);
        if((root.val-prev)<min)
            min=Math.abs(root.val-prev);
        
        root.val=findMin(root.right,root.val);
        return root.val;
    }
}