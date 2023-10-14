package Trees;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;



public class Leetcode572SubtrreeofAnotherTree {
    public static void main(String[] args) {
        Leetcode572SubtrreeofAnotherTree leetcode572SubtrreeofAnotherTree = new Leetcode572SubtrreeofAnotherTree();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left= new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subroot = new TreeNode(4);
        subroot.left = new TreeNode(1);
        subroot.right = new TreeNode(3);


        System.out.println(leetcode572SubtrreeofAnotherTree.isSubtree(root,subroot));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null || isSameTree(root, subRoot)) return true;
        if (root == null) return false;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null || p.val!=q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}


