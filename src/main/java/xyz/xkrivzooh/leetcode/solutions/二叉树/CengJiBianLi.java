package xyz.xkrivzooh.leetcode.solutions.二叉树;

public class CengJiBianLi {
    //给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
    //https://leetcode-cn.com/leetbook/read/data-structure-binary-tree/xefh1i/

//    解题思路
//    遍历法。使用队列作为辅助。先将根节点放入队列。
//    内层循环把队列元素都取出来放入集合。并且把集合中的每个元素的左右子节点加入队列。等待下一次循环。
//    每次内循环结束时就完成了上一层节点的集合，把集合加到返回结果集中，继续下一层内循环。
//    时间复杂度O(n^2)，空间复杂度O（n）。

//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        // 先将根节点放入队列
//        queue.add(root);
//        while (queue.size() > 0) {
//            int size = queue.size();
//            List<Integer> temp = new ArrayList<>();
//            // 遍历队列，把当前层的元素从队列取出来，将下一层放入队列
//            for (int i = 0; i < size; i++) {
//                // 取出队列元素，放入集合
//                TreeNode current = queue.poll();
//                temp.add(current.val);
//                if (current.left != null) {
//                    // 将当前节点的左儿子放入队列
//                    queue.add(current.left);
//                }
//                if (current.right != null) {
//                    // 将当前节点的右儿子放入队列
//                    queue.add(current.right);
//                }
//            }
//            result.add(temp);
//        }
//        return result;
//    }


}
