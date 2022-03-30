package xyz.xkrivzooh.leetcode.solutions.二叉树;

public class DeepOfTree {

//    private int maxDepth = 0;
//
//    /**
//     * 二叉树的最大深度 - 递归
//     *
//     * @param root
//     * @return
//     */
//    public int maxDepth(TreeNode root) {
//        if (root != null) {
//            maxDepthRecur(root, 1);
//        }
//
//        return maxDepth;
//    }
//
//    /**
//     * 二叉树的最大深度 - 递归
//     *
//     * @param root
//     * @param depth
//     */
//    private void maxDepthRecur(TreeNode root, int depth) {
//        if (root == null) {
//            return;
//        }
//
//        if (root.left == null && root.right == null) {
//            maxDepth = Math.max(maxDepth, depth);
//        }
//
//        maxDepthRecur(root.left, depth + 1);
//        maxDepthRecur(root.right, depth + 1);
//    }

    //简单解法

//    public int maxDepth(TreeNode root) {
//        return root==null? 0 : Math.max(maxDepth(root.left), maxDepth(root.right))+1;
//    }


    //非递归解法
//    public int maxDepth(TreeNode root) {
//        if (root == null)
//            return 0;
//        //创建一个队列
//        Deque<TreeNode> deque = new LinkedList<>();
//        deque.push(root);
//        int count = 0;
//        while (!deque.isEmpty()) {
//            //每一层的个数
//            int size = deque.size();
//            while (size-- > 0) {
//                TreeNode cur = deque.pop();
//                if (cur.left != null)
//                    deque.addLast(cur.left);
//                if (cur.right != null)
//                    deque.addLast(cur.right);
//            }
//            count++;
//        }
//        return count;
//    }


}
