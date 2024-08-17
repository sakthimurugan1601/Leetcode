class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> list=new ArrayList<>();
       if(root==null){
        return list;
       }
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            if(i==size-1){
                list.add(temp.val);
            }
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
       } 
       return list;
    }
}