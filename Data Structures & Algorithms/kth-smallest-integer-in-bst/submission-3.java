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
    public List<Integer> list=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {

        
        smallest(root);
        return list.get(k-1);

        
    }

    void smallest(TreeNode root){
        if(root==null) return;
        if(root.left!=null) smallest(root.left);
                list.add(root.val);
        if(root.right!=null) smallest(root.right);
        return;

    }
}
