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
    public boolean balance=true;
    public boolean isBalanced(TreeNode root) {
       
        height(root);
        return balance;
        

    }


    int height(TreeNode root) {
        if(root ==null) return 0;
        int leftHeight = 1+height(root.left);
        int rightHeight= 1+height(root.right);
        if(leftHeight>rightHeight+1 || rightHeight>leftHeight+1){
            balance=false;
        }
        return Math.max(leftHeight,rightHeight);
    }
}
