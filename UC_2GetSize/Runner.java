package UC_2GetSize;

public class Runner {
	public static void main(String[] args) {
		BinarySearchTree<Integer> element = new BinarySearchTree<>();
		element.add(56);
		element.add(30);
		element.add(22);
		element.add(40);
		element.add(60);
		element.add(95);
		element.add(11);
		element.add(65);
		element.add(3);
		element.add(16);
		element.add(63);
		element.add(67);
		element.printNodes();
		int size = element.getSize();
		System.out.println("Size of tree "+" " +size);
	}
}