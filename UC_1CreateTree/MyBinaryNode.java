package UC_1CreateTree;

public class MyBinaryNode<k extends Comparable<k>> {
	k value;
	MyBinaryNode<k> right;
	MyBinaryNode<k> left;

	
	 // Constructor for node variable
	 

	public MyBinaryNode(k value) {
		this.value = value;
		right = null;
		left = null;
	}
}