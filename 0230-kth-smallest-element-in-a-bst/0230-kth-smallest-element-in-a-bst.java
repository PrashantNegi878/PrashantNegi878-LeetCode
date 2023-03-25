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
    ArrayList<Integer> l = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        addToList(root, k);
        return l.get(k-1);
    }

    public void addToList(TreeNode root,int k) {
        if (root==null || l.size()>=k)
            return ;
        addToList(root.left,k);
        l.add(root.val);
        addToList(root.right,k);
        return;
    }

}