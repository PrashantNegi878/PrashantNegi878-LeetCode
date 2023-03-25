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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> largeList = new ArrayList<>();
        if (root == null)
            return largeList;

        while(!q.isEmpty())
        {
            int qlength=q.size();
            List<Integer> smallList = new ArrayList<>();
            for(int i=0;i<qlength;i++)
            {
                TreeNode temp=q.poll();
                smallList.add(temp.val);
                if (temp.left!=null) q.add(temp.left);
                if (temp.right!=null) q.add(temp.right);
            }
            largeList.add(smallList);
        }
        return largeList;
    }
}