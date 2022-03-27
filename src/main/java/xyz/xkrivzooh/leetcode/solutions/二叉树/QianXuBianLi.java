package xyz.xkrivzooh.leetcode.solutions.二叉树;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class QianXuBianLi {

    //递归的方式
//    public static void preOrder(TreeNode tree) {
//        if (tree == null)
//            return;
//        System.out.printf(tree.val + "");
//        preOrder(tree.left);
//        preOrder(tree.right);
//    }


    //非递归的方式（使用了一个stack）

//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        //加个边界条件判断
//        if (root == null)
//            return res;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);//压栈
//        while (!stack.empty()) {
//            TreeNode t1 = stack.pop();//出栈
//            res.add(t1.val);
//            if (t1.right != null) {
//                stack.push(t1.right);
//            }
//            if (t1.left != null) {
//                stack.push(t1.left);
//            }
//        }
//        return res;
//    }


}
