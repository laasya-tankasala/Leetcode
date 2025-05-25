package interview150.binaryTree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PathSumTest {

    private final PathSum pathSum = new PathSum();

    private TreeNode createTree1() {
        // Tree:       5
        //           /   \
        //         4      8
        //       /       / \
        //     11      13   4
        //    /  \           \
        //   7    2           1
        return new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, null, new TreeNode(1)))
        );
    }

    @Test
    public void testExamplePathExists() {
        TreeNode root = createTree1();
        assertTrue(pathSum.hasPathSum(root, 22));
    }

    @Test
    public void testExamplePathDoesNotExist() {
        TreeNode root = createTree1();
        assertFalse(pathSum.hasPathSum(root, 30));
    }

    @Test
    public void testEmptyTree() {
        assertFalse(pathSum.hasPathSum(null, 0));
    }

    @Test
    public void testSingleNodeSuccess() {
        TreeNode root = new TreeNode(5);
        assertTrue(pathSum.hasPathSum(root, 5));
    }

    @Test
    public void testSingleNodeFail() {
        TreeNode root = new TreeNode(5);
        assertFalse(pathSum.hasPathSum(root, 1));
    }

    @Test
    public void testNegativeNumbers() {
        TreeNode root = new TreeNode(-2, null, new TreeNode(-3));
        assertTrue(pathSum.hasPathSum(root, -5));
    }
}