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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();
        Boolean LtoR =false;

        if (root==null)
            return result;

        dq.add(root);

        while(dq.peek()!=null)
        {
            List<Integer> currentLevel = new ArrayList<>();
            int l = dq.size();
            for(int i=0;i<l;i++)
            {
                TreeNode temp;
                temp=dq.poll();                
                if (temp.left!=null)dq.add(temp.left);
                if (temp.right!=null)dq.add(temp.right);
                currentLevel.add(temp.val);   
            }
            if (LtoR)
                Collections.reverse(currentLevel);
            result.add(currentLevel);
            LtoR=!LtoR;
        }

        return result;

    }
}