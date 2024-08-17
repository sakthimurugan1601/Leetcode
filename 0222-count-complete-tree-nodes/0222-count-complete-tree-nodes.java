class Solution {
    public int countNodes(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        int count=0;
        if(root==null){
            return 0;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                 count++;
                 if(temp.left!=null){
                    q.offer(temp.left);
                 }
                 if(temp.right!=null){
                    q.offer(temp.right);
                 }
            }
        }
        return count;
    }
}