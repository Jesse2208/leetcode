import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class binary_tree_postorder_iterator {
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer> array=new ArrayList<Integer>();
       Stack<TreeNode> stack=new Stack<TreeNode>();
       TreeNode current,p=null;
       current=root;
       while(current!=null||!stack.isEmpty()){
       while(current!=null){
    	   stack.push(current);
    	   current=current.left;	   
       }
       current=stack.peek();
       current=current.right;
       if(current!=null&&current!=p)
    	   continue;
       else{
    	   current=stack.pop();
    	   array.add(current.val);
    	   p=current;
    	   current=null;
    	   }
       
       }
       
       return array;
        
	
        
    }
}

