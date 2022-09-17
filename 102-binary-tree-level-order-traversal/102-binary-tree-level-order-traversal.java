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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> a = new LinkedList<List<Integer>>();
        if(root == null) return a;
        queue.add(root);
        
        while(queue.isEmpty()==false){
            int size = queue.size();
            List<Integer> b = new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
                b.add(curr.val);
            }
            a.add(b);
            
        }
        return a;
    }
}