package interview150.binaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvertBinaryTreeTest {

    InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    @Test
    void testNullNode(){
        assertEquals(null, invertBinaryTree.invertTree(null));
    }

    @Test
    void testSingleElementTree(){
        TreeNode root = new TreeNode(3);
        assertEquals(root, invertBinaryTree.invertTree(root));
    }

    @Test
    void testBalancedTreeWithHeightOne(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode ans = invertBinaryTree.invertTree(root);

        assertEquals(1, ans.val);
        assertEquals(3, ans.left.val);
        assertEquals(2, ans.right.val);

    }

    @Test
    void testUnbalancedTreeWithHeightOne(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = null;

        TreeNode ans = invertBinaryTree.invertTree(root);

        assertEquals(1, ans.val);
        assertEquals(null, ans.left);
        assertEquals(2, ans.right.val);

    }
    @Test
    void testBalancedTreeWithHeightTwo(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        TreeNode ans = invertBinaryTree.invertTree(root);

        assertEquals(1, ans.val);
        assertEquals(3, ans.left.val);
        assertEquals(2, ans.right.val);
        assertEquals(7, ans.left.left.val);
        assertEquals(6, ans.left.right.val);
        assertEquals(5, ans.right.left.val);
        assertEquals(4, ans.right.right.val);

    }

    @Test
    void testUnbalancedTreeWithHeightTwo(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);

        /*
                original tree
                    1
                   / \
                  2   3
                     /
                    4
                 inverted tree
                    1
                   / \
                  3   2
                   \
                    4

         */
        TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(3);
        expected.left.right = new TreeNode(4);
        expected.right = new TreeNode(2);

        TreeNode ans = invertBinaryTree.invertTree(root);
        SameTree sameTree = new SameTree();
        assertTrue(sameTree.isSameTree(expected, ans));

    }



}
