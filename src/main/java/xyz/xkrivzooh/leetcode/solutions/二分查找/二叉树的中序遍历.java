package xyz.xkrivzooh.leetcode.solutions.二分查找;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.lang.StringBuilder;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// @solution-sync:begin
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        while ((root != null) || (!stack.empty())) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

           if (!stack.empty()) {
               root = stack.pop();
               result.add(root.val);
               root = root.right;
           }
        }

        return result;
    }
}
// @solution-sync:end

// @solution-sync:begin
class Solution1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        inorderTraversal0(root, result);
        return result;
    }

    private void inorderTraversal0(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inorderTraversal0(root.left, result);
        }

        result.add(root.val);

        if (root.right != null) {
            inorderTraversal0(root.right, result);
        }

    }

}
// @solution-sync:end