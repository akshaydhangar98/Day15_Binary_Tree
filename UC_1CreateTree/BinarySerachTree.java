package UC_1CreateTree;

public class BinarySerachTree<k extends Comparable<k>> {
	MyBinaryNode<k> root;
	
	//adding key to the tree 
	public void add(k key) {
		this.root = this.insert(root,key);
	}
	
	//param root  is a root key for left and right side key
	//param value is value / data of tree node
	//return Adding key to the node of tree
	
	private MyBinaryNode<k> insert(MyBinaryNode<k> root, k value) {
		if (root == null) {
			return new MyBinaryNode<>(value);
		}
		int compareResult = value.compareTo(root.value);
		if (compareResult == 0) {
			return root;
		}
		if (compareResult < 0) {
			root.left = insert(root.left, value);
		} else if (compareResult > 0) {
			root.right = insert(root.right, value);
		}
		return root;

	}

	
	 // It displays the node
	 

	public void printNodes() {
		printNodes(root);
	}

	private void printNodes(MyBinaryNode<k> root) {
		if (root != null) {
			printNodes(root.left);
			System.out.println(root.value);
			printNodes(root.right);

		}
	}

}