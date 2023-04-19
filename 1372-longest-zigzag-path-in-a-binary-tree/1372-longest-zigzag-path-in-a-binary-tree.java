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
    int max=0;
    public int longestZigZag(TreeNode root) {
        maxZigZag(root.right,1,false);
        maxZigZag(root.left,1,true);
        return max;
    }

    public void maxZigZag(TreeNode root, int currMax, boolean prevDirectionRight)
    {
        if (root==null) return;
        max=Math.max(max,currMax);
        if(!prevDirectionRight)
        {
            maxZigZag(root.left,currMax+1,!prevDirectionRight);
            maxZigZag(root.right,1,prevDirectionRight);
        }
            
        else if(prevDirectionRight) 
        {
            maxZigZag(root.left,1,prevDirectionRight);
            maxZigZag(root.right,currMax+1,!prevDirectionRight);
        } 
    }
}