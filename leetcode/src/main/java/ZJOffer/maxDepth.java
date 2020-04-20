package ZJOffer;

/**
 * @author zack
 * @create 2020-04-21-4:15
 */
public class maxDepth {
    public int maxDepth(TreeNode root) {
        if (root.left == null || root.right == null) {
            return 1;
        }
        return maxDepth(root.left) > maxDepth(root.right) ? maxDepth(root.left) : maxDepth(root.right) ;
    }
}
