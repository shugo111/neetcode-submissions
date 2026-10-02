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
        List<List<Integer>> result= new ArrayList<>();

        Queue<TreeNode> q = new ArrayDeque<>();
        if(root!=null) q.offer(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();

            int size= q.size();

            for(int i=0;i<size;i++){
                TreeNode e=q.poll();
                list.add(e.val);
                if(e.left!=null) q.offer(e.left);
                if(e.right!=null) q.offer(e.right);
            }
            result.add(list);
        }
        return result;
    }
}
