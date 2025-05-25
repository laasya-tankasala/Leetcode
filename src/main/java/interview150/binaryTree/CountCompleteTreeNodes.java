package interview150.binaryTree;
/*
    Given the root of a complete binary tree, return the number of the nodes in the tree.
    According to Wikipedia, every level, except possibly the last, is filled in a complete binary tree,
    and all nodes in the last level are as far left as possible.
    It can have between 1 and 2h nodes inclusive at the last level h.

    Design an algorithm that runs in less than O(n) time complexity.

    Constraints:

    The number of nodes in the tree is in the range [0, 5 * 10^4].
    0 <= Node.val <= 5 * 10^4
    The tree is guaranteed to be complete.

    https://leetcode.com/problems/count-complete-tree-nodes/

    GFG article: https://www.geeksforgeeks.org/count-number-of-nodes-in-a-complete-binary-tree/
 */
public class CountCompleteTreeNodes {

    /*
        read https://www.geeksforgeeks.org/complete-binary-tree/
        time
        best case: O(logn)
        worst case: O(logn *  logn)
        space
        best case: O(1)
        worst case: O(logn) - recursion stack.
     */
    public int countNodes(TreeNode root) {

        if(root==null) return 0;

        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);

        if(leftHeight==rightHeight)
            return (1 << leftHeight) - 1;
        else
            return 1 + countNodes(root.left) + countNodes(root.right);

    }

    private int rightHeight(TreeNode root) {
        int height = 0;
        while(root!=null) {
            height++;
            root=root.right;
        }
        return height;

    }

    private int leftHeight(TreeNode root) {
        int height = 0;
        while(root!=null) {
            height++;
            root=root.left;
        }
        return height;
    }
}
