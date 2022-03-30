package xyz.xkrivzooh.leetcode.solutions.二叉树;

//给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。
// 判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。
// 如果存在，返回 true ；否则，返回 false 。

public class LuJinZongHe {
//    https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xo566j/

//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null)
//            return false;
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);//根节点入栈
//        while (!stack.isEmpty()) {
//            TreeNode cur = stack.pop();//出栈
//            //累加到叶子节点之后，结果等于sum，说明存在这样的一条路径
//            if (cur.left == null && cur.right == null) {
//                if (cur.val == sum)
//                    return true;
//            }
//            //右子节点累加，然后入栈
//            if (cur.right != null) {
//                cur.right.val = cur.val + cur.right.val;
//                stack.push(cur.right);
//            }
//            //左子节点累加，然后入栈
//            if (cur.left != null) {
//                cur.left.val = cur.val + cur.left.val;
//                stack.push(cur.left);
//            }
//        }
//        return false;
//    }


}
