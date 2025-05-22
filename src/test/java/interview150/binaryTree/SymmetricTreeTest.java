package interview150.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {

    SymmetricTree symmetricTree = new SymmetricTree();
    @Test
    void testNullNode() {
        TreeNode root = null;
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSymmetricBalancedTreeOfHeightOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        assertTrue(symmetricTree.isSymmetric(root));
    }


    @Test
    void testAsymmetricBalancedTreeOfHeightOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void testAsymmetricUnbalancedTreeOfHeightOne() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertFalse(symmetricTree.isSymmetric(root));
    }



    @Test
    void testSymmetricBalancedTreeOfHeightTwo() {
        /*
                    1
                   / \
                  2   2
                 / \ / \
                3  4 4  3

         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void testSymmetricUnbalancedTreeOfHeightTwo() {
        /*
                    1
                   / \
                  2   2
                 /     \
                3       3

         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertTrue(symmetricTree.isSymmetric(root));
    }



    @Test
    void testAsymmetricBalancedTreeOfHeightTwo() {
        /*
                    1
                   / \
                  2   2
                 / \ / \
                3  4 3  4
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        assertFalse(symmetricTree.isSymmetric(root));
    }

    @Test
    void testAsymmetricUnbalancedTreeOfHeightTwo() {
        /*
                    1
                   / \
                  2   2
                 /   /
                3   3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertFalse(symmetricTree.isSymmetric(root));
    }


}
