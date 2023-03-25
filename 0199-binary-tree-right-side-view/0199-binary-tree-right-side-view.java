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
    List<Integer> l = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        findRSV(root,0);
        return l;
    }

    public void findRSV(TreeNode root,Integer index) {
        if (root==null)
            return;
        if (l.size()<=index)
            l.add(index,root.val);
        else
            l.set(index,root.val);
        findRSV(root.left,index+1);
        findRSV(root.right,index+1);
    }
}