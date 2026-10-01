class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root,targetSum,path,ans);
        return ans;
    }
    void dfs(TreeNode root, int target,List<Integer>path,List<List<Integer>>ans)
    {
        if(root==null)
          return;
        List<Integer> newPath=new ArrayList<>(path);
        newPath.add(root.val);
        if(root.left==null&&root.right==null)
        {
            if(target==root.val)
              ans.add(newPath);
            return;
        }
        int bal=target-root.val;
        dfs(root.left,bal,newPath,ans);
        dfs(root.right,bal,newPath,ans);
    }
}