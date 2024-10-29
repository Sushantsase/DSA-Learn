//package tree;
//
//import static tree.MaxSum.findMax;
//
//class TreeNode{
//    int val;
//    TreeNode left, right;
//
//    public TreeNode(int val){
//        this.val=val;
//        left=right=null;
//    }
//}
//class MaxSum{
//    private static int maxSum = Integer.MIN_VALUE;
//
//    public static void findMax(TreeNode node){
//       calculateSum(root);
//       return maxSum;
//
//    }
//
//    private static int calculateSum(TreeNode node){
//        if(node==null) return 0;
//        int leftsum = calculateSum(node.left);
//        int rightsum = calculateSum(node.right);
//
//        int sumOD = node.val+ leftsum+rightsum;
//
//        maxSum = Math.max(maxSum,sumOD);
//
//        return sumOD;
//    }
//
//}
//public class SumofNodesBinaryTree {
//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//        System.out.println("Max:"+ findMax(root));
//    }
//}
