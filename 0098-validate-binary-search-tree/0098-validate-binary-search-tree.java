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
    
    public boolean isValidBST(TreeNode root) {
        boolean result=checkValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
        return result;
    }

    public boolean checkValidBST(TreeNode root, long min, long max)
    {
            if (root==null)
                return true;
            if((min<root.val && root.val<max) && (checkValidBST(root.left,min,root.val) && 
            checkValidBST(root.right,root.val,max)))
                return true;
            else
                return false;
    }
    
}