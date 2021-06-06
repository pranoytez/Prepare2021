package tez.learn;

public class BST {
	TreeNode root = null;
	int result = 0;
	static TreeNode searchResultNode = null;
	
	public void insert(TreeNode node) {
		
	}
	
	public void delete(TreeNode node) {
		
	}
	
	public static TreeNode searchBST(TreeNode root, int val) {
		while(root != null){
            if(root.val == val) {
            	searchResultNode = root;
            	break;       	
            }
            if(root.val > val)
                root = root.left;
            else
                root = root.right;
        }
		return searchResultNode;
	}
	
	
	public void inOrderPrint(TreeNode root) {
		if(root == null)
			return;
		inOrderPrint(root.left);
		System.out.println(root.val);
		inOrderPrint(root.right);
	}
	
	public int rangeSumBST(TreeNode root, int low, int high) {
		//using dfs
		rangeSumHelper(root, low, high);
		return result;
	}
	public void rangeSumHelper(TreeNode root, int low, int high) {
		if(root != null) {
			if(root.val >= low || root.val <= high) {
				result = result + root.val;
			}
			if(root.val > low)
				rangeSumHelper(root.left,low,high);
			if(root.val < high)
				rangeSumHelper(root.right,low,high);
		}
	}
	
	
	public static void main(String[] args) {
		BST tree = new BST();
		TreeNode root = new TreeNode(10);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(15);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(18);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		
		tree.root = root;
		
		//tree.inOrderPrint(root);
		//System.out.print(tree.rangeSumBST(root, 7, 15));
		
		
		BST searchTree = new BST();
		TreeNode root2= new TreeNode(4);
		TreeNode searchTreeNode1 = new TreeNode(2);
		TreeNode searchTreeNode2 = new TreeNode(7);
		TreeNode searchTreeNode3 = new TreeNode(1);
		TreeNode searchTreeNode4 = new TreeNode(3);
		searchTree.root = root2;
		root2.left = searchTreeNode1;
		root2.right = searchTreeNode2;
		searchTreeNode1.left = searchTreeNode3;
		searchTreeNode1.right = searchTreeNode4;
		
		System.out.print(searchBST(root2, 2).val);
	}

}
