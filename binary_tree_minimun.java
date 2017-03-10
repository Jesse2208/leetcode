import java.util.Queue;
import java.util.LinkedList;
//采用广度遍历
public class binary_tree_minimun {
    public int run(TreeNode root) {
    	if (root==null)
    		return 0;
    	Queue<TreeNode> q=new LinkedList<TreeNode>();
    	TreeNode first=root,current;
    	q.offer(root);
    	int i=0;
    	while(!q.isEmpty()){
    		current=q.poll();
    		if(current==first)
    			i++;//当节点为每层最左边的节点时，深度+1
    		if(current.left==null&&current.right==null)
    			break;
    		if(current.left!=null){
    			q.offer(current.left);
    			if(current==first)
    				first=current.left;
    			else first=current.right;
    			}	
    		if(current.right!=null)
    			q.offer(current.right);
    		
    	}
    	return i;
    }
    public static void main(String []args){
    	TreeNode t=new TreeNode(2);
    	t.left=new TreeNode(3);
    	t.right=new TreeNode(3);
    	t.right.right=new TreeNode(3);
    	t.left.left=new TreeNode(3);
    	binary_tree_minimun s=new binary_tree_minimun();
    	System.out.println(s.run(t));
    }
}
/*class TreeNode{
	 int val;
	 TreeNode left=null;
	 TreeNode right=null;
	 TreeNode(int x) { val = x; }
}*/
