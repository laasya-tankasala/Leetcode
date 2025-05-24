package interview150.binaryTree;

import com.sun.source.tree.Tree;

/*
    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    Constraints:
    The number of nodes in the tree is in the range [1, 1000].
    -100 <= Node.val <= 100

    https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {


    /*
        Using recursion,
        time O(n) -
        visiting every node exactly once.
        space O(h) -
        where h is the height of the tree.
        recursion calls stored in the stack.
     */
    public boolean isSymmetric(TreeNode root) {

        if(root == null)
            return true;
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){

        if(left ==null && right == null)
            return true;

        if(left==null || right ==null)
            return false;

        if(left.val != right.val)
            return false;

        return isMirror(left.left, right.right) && isMirror(left.right , right.left);


    }
}
