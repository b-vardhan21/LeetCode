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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        // if(root == null){
        //     return null;
        // }
       
        calculate(root, a);
        return a;
    }
        public void calculate(TreeNode root, ArrayList<Integer> a)
        {
            if(root==null)
        {
            return;
        }

            a.add(root.val);
            calculate(root.left, a);
            calculate(root.right, a);
        }
    
}