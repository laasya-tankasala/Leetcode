package interview150.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeTest {

    SameTree sameTree = new SameTree();
    @Test
    void testNullRoots(){
        assertTrue(sameTree.isSameTree(null, null));
    }

    @Test
    void testOneNullAndOneNonNull(){
        TreeNode root = new TreeNode(1);
        assertFalse(sameTree.isSameTree(root, null));
        assertFalse(sameTree.isSameTree(null, root));
    }

    @Test
    void testSameSingleNode() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testDifferentSingleNode() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testSameStructureAndValues() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void testDifferentStructure() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void testDifferentValuesInSubtrees() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(p, q));

    }

}
