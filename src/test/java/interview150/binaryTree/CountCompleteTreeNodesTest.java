package interview150.binaryTree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountCompleteTreeNodesTest {

    CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();

    @Test
    public void testEmptyTree() {
        TreeNode root = null;
        assertEquals(0, countCompleteTreeNodes.countNodes(root));
    }

    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, countCompleteTreeNodes.countNodes(root));
    }

    @Test
    public void testPerfectBinaryTree() {
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7))
        );
        assertEquals(7, countCompleteTreeNodes.countNodes(root));
    }

    @Test
    public void testCompleteBinaryTree() {
        //        1
        //      /   \
        //     2     3
        //    / \   / 
        //   4   5 6   
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), null)
        );
        assertEquals(6, countCompleteTreeNodes.countNodes(root));
    }

}

