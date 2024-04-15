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
 * @return {number}
 */
var sumNumbers = function(root) {
    let result=0;
    function findSum(root,currSum){
        if(!root) return;
        currSum=currSum*10+root.val;
        if((!root.left) && (!root.right)) result+=currSum;
        findSum(root.left,currSum);
        findSum(root.right,currSum);
    }
    findSum(root,result);
    return result;
};