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
    List<TreeNode> nodes=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0,nodes.size()-1);
    }
    private void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        nodes.add(root);
        inorder(root.right);
     }
     private TreeNode build(int left,int right){
        if(left>right) return null;
        int mid=(left+right)/2;
        TreeNode node=nodes.get(mid);
        node.left=build(left,mid-1);
        node.right=build(mid+1,right);
        return node;
     }
}