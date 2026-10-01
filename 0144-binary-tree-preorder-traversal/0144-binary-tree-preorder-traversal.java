class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        preorder(root, result);

        return result;
    }

    void preorder(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            preorder(root.left, result);
            preorder(root.right, result);
        }
    }
}