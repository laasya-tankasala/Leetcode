package interview150.binaryTree;

/*
    Given the root of a binary tree and an integer targetSum,
    return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
    A leaf is a node with no children.

    Constraints:
    The number of nodes in the tree is in the range [0, 5000].
    -1000 <= Node.val <= 1000
    -1000 <= targetSum <= 1000

    https://leetcode.com/problems/path-sum/

    GFG article: https://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
 */
public class PathSum {

    /*
        DFS Approach
        O(n) time
        O(h) space due to call stack.
            where h is the height of the tree.
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null && root.val == targetSum)
            return true;
        return hasPathSum(root.left, targetSum - root.val) ||
                hasPathSum(root.right, targetSum-root.val);
    }
}
