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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> m = new HashMap<Long,Integer>();
        m.put(0l,1);
        dfs(root,0l,targetSum,m);
        return count;
    }

    public void dfs(TreeNode root, Long cs, int targetSum, Map<Long,Integer> m) {
        if (root==null) return;
        cs+=root.val;
        Long x=cs-targetSum;
        if(m.containsKey(x))
        {    
            count+=m.get(x);
        }
        m.merge(cs,1,Integer::sum);
        dfs(root.left,cs,targetSum,m);
        dfs(root.right,cs,targetSum,m);
        m.merge(cs,-1,Integer::sum);
    }
}