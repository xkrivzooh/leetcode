package xyz.xkrivzooh.leetcode.solutions.二叉树;

public class ZhongXuBianLi {

    //递归
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        inOrderTraversal(root, res);
//        return res;
//    }
//
//    public void inOrderTraversal(TreeNode root, List<Integer> res) {
//        if (root == null)
//            return;
//        //先打印左子树，然后打印当前节点，最后再打印右子树
//        inOrderTraversal(root.left, res);
//        res.add(root.val);
//        inOrderTraversal(root.right, res);
//    }


    //非递归
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> res = new ArrayList<>();
//        //加个边界条件判断
//        if (root == null)
//            return res;
//        Stack<TreeNode> stack = new Stack<>();
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            if (!stack.isEmpty()) {
//                root = stack.pop();
//                res.add(root.val);
//                root = root.right;
//            }
//        }
//        return res;
//    }


}
