/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @param {number} depth
 * @return {TreeNode}
 */
var addOneRow = function(root, val, depth) {

    if(depth==1) return root=new TreeNode(val,root,null);

    function AddNode(root,level){
        if(root==null)return;
        if(level==depth-1){
            root.left=new TreeNode(val,root.left,null);
            root.right=new TreeNode(val,null,root.right);
            return;
        }
        else{
            AddNode(root.left,level+1);
            AddNode(root.right,level+1);
        }
    }
    AddNode(root,1);
    return root;
};