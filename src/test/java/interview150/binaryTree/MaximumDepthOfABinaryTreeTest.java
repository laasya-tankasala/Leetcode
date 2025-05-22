package interview150.binaryTree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfABinaryTreeTest {

    @Test
    void testNullRoot() {
        MaximumDepthOfABinaryTree solution = new MaximumDepthOfABinaryTree();
        assertEquals(0, solution.maxDepthusingLOT(null));
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        MaximumDepthOfABinaryTree solution = new MaximumDepthOfABinaryTree();
        assertEquals(1, solution.maxDepthusingLOT(root));
    }

    @Test
    void testTwoLevelTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        MaximumDepthOfABinaryTree solution = new MaximumDepthOfABinaryTree();
        assertEquals(2, solution.maxDepthusingLOT(root));
    }

    @Test
    void testBalancedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        MaximumDepthOfABinaryTree solution = new MaximumDepthOfABinaryTree();
        assertEquals(3, solution.maxDepthusingLOT(root));
    }

    @Test
    void testUnbalancedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        MaximumDepthOfABinaryTree solution = new MaximumDepthOfABinaryTree();
        assertEquals(4, solution.maxDepthusingLOT(root));
    }
}
