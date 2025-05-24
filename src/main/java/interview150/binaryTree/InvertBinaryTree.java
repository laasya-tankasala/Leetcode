package interview150.binaryTree;

/*
    Given the root of a binary tree, invert the tree, and return its root.

    invert --> lateral inversion/mirror

    Constraints:
    The number of nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100

    https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {

    /*
        Using recursion,
        time O(n) -
        visiting every node exactly once.
        space O(h) -
        where h is the height of the tree.
        recursion calls stored in the stack.
     */

    public TreeNode invertTree(TreeNode root) {

        if(root==null) return null;
        mirror(root);
        return root;
    }

    public void mirror(TreeNode curr){

        if(curr!=null) {
            TreeNode tmp = curr.left;
            curr.left = curr.right;
            curr.right = tmp;

            mirror(curr.left);
            mirror(curr.right);
        }
    }
}
