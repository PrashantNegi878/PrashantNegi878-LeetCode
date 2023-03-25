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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        int a=calculateHeight(root);
        return flag;
    }

    public int calculateHeight(TreeNode root) {
        int h=0,l,r;
        if (root==null)
            return h;
        l=calculateHeight(root.left)+1;
        r=calculateHeight(root.right)+1;
        if(Math.abs(l-r)>1)
            flag=false;
        return Math.max(l,r);
    }


}