package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    //definition of a binary tree node
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Tools (traversal)
    public void preorderTraversal(TreeNode root){
        if(root.left!=null) preorderTraversal(root.left);
        System.out.print(root.val);
        if(root.right!=null) preorderTraversal(root.right);
    }

    /**
     * diameter of a tree is the longest path between two nodes in a tree
     * @param root
     * @return the longest path
     */
    public int diameterOfBinaryTree(TreeNode root) {

    }

    /**
     * a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections.
     * The path must contain at least one node and does not need to go through the root.
     * @param root non-empty tree node
     * @return the max path sum
     */
    public int maxPathSum(TreeNode root) {

    }

    /**
     * construct a binary search tree from a preorder array
     * @param preorder
     * @return
     */
    public TreeNode bstFromPreorder(int[] preorder) {

    }

    /**
     * determine if two nodes are at the same depth
     * @param root
     * @param x tree node with value x
     * @param y tree node with value y
     * @return if x and y are at the same depth
     */
    public boolean isCousins(TreeNode root, int x, int y) {

    }

    /**
     * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     * @param root
     * @param k
     * @return
     */
    public int kthSmallest(TreeNode root, int k) {

    }

    /**
     * Implement trie tree with insert, search, startWith
     */
    public Trie() {

    }
    class TrieNode {

    }
    public void insert(String word) {

    }
    public boolean search(String word) {

    }
    public boolean startsWith(String prefix) {

    }

    /**
     * Invert a binary tree
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode n = queue.poll();

            TreeNode left = n.left!=null?n.left:null;
            TreeNode right = n.right!=null?n.right:null;

            if(right!=null) {
                n.left = right;
                queue.add(n.left);
            }else{
                n.left=null;
            }
            if(left!=null) {
                n.right=left;
                queue.add(n.right);
            }else{
                n.right=null;
            }
        }
        return root;
    }


}
