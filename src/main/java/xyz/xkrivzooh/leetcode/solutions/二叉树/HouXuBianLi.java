package xyz.xkrivzooh.leetcode.solutions.二叉树;

public class HouXuBianLi {

    //递归
//    class Solution {
//        public List<Integer> postorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<>();
//            postOrder(root,res);
//            return res;
//        }
//        private void postOrder(TreeNode node,List<Integer> res){
//            if(node == null){
//                return;
//            }
//            postOrder(node.left,res);
//            postOrder(node.right,res);
//            res.add(node.val);
//        }
//    }

    //非递归

//    前序：根-左-右
//    后序：左-右-根
//    后序相当于 [根-右-左] 的逆序。
//    对于迭代求前序遍历可以根节点先入栈，然后右子树进栈，最后左子树进栈；
//    此时便可以根节点先入栈，然后左子树进栈，最后右子树进栈，最后将列表逆序即为所求。

//    class Solution {
//        public List<Integer> postorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<>();
//            Stack<TreeNode> stack = new Stack<>();
//            if(root == null) return res;
//            stack.push(root);
//            while(!stack.isEmpty()){
//                TreeNode cur = stack.pop();
//                res.add(cur.val);
//                if(cur.left!=null) stack.push(cur.left);
//                if(cur.right!=null) stack.push(cur.right);
//            }
//            Collections.reverse(res);
//            return res;
//        }
//    }

}
