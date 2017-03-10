
import java.util.ArrayList;
import java.util.Stack;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class binary_tree_preorder_recursive {
	public void preorderTraversal(TreeNode root) {
		if (root!=null)
			{System.out.println(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binary_tree_preorder_recursive b=new binary_tree_preorder_recursive();
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.left.left=new TreeNode(4);
		tn.right=new TreeNode(3);
		b.preorderTraversal(tn);
	}

}

