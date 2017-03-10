import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class binary_tree_preorder_iterator {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer> array=new ArrayList<Integer>();
       Stack<TreeNode> stack=new Stack<TreeNode>();
       TreeNode current,left,right;
       current=root;
       while(current!=null||!stack.isEmpty()){
    	   while(current!=null){
    		   array.add(current.val);
    		   stack.push(current);
    		   current=current.left;
    	   }
    	   current=stack.pop();
    	   current=current.right;
       }
       return array;
        
	
        
    }
}