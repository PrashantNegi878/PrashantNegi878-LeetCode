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

    int max;

    public int maxPathSum(TreeNode root) {
        max=root.val;
        solve(root,0);
        return max;
    }

    public int solve(TreeNode root, int result)
    {
        if(root==null)  return 0;

        int l = solve(root.left,result);
        int r = solve(root.right,result);

        int temp=Math.max(Math.max(l,r)+root.val,root.val);

        int ans=Math.max(temp,l+r+root.val);

        max=Math.max(max,ans);

        return temp;
    }
}