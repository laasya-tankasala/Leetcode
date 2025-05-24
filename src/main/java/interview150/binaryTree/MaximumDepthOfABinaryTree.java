package interview150.binaryTree;


import java.util.LinkedList;
import java.util.Queue;

/*
    Given the root of a binary tree, return its maximum depth.
    A binary tree's maximum depth is the number of nodes along the longest path
    from the root node down to the farthest leaf node.

    https://leetcode.com/problems/maximum-depth-of-binary-tree/
*/

public class MaximumDepthOfABinaryTree {

    /*
         Using recursion,
         O(n) time -
          every node is visited exactly once.
         O(h) space -
          the method uses recursive function calls, which are stored in the call stack
          Where h is the height of the binary tree.
          Best case (balanced tree): h = log(n)
          Worst case (skewed tree): h = n
     */
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /*
       Using level order traversal,
       O(n) time -
        all nodes are visited exactly once.
        The while loop runs depth times. Inside it, every poll and add operation is constant time (O(1)).
        So, total operations = proportional to the number of nodes.
       O(w) space -
        Where w = the maximum width of the tree (i.e., the maximum number of nodes at any level).
        The Queue stores up to w nodes at the same time (in the worst case, a complete level).
        worst case (a perfect binary tree): O(n) ∵ w ≈ n/2
        Best case (skewed tree): O(1)
     */
    public int maxDepthusingLOT(TreeNode root) {

        if (root == null) return 0;

        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            depth++;
        }

        return depth;

    }
}
