package hw04;

/**
 * Find the key associated with the minimum value in a tree.
 */
public class MinKeyFinder implements CS232Visitor<String, Integer> {
	private String minkey;
	private Integer minvalue;


	public MinKeyFinder() {
		minkey = null;
		minvalue = Integer.MAX_VALUE;

	}

	/**
	 * {@inheritDoc}
	 */
	public void visit(String key, Integer value) {
		if (value <= minvalue) {
			minkey = key;
			minvalue = value;
		}

	}

	/**
	 * Get the key associated with the minimum value in the tree.
	 * 
	 * @return the key associated with the minimum value.
	 */
	public String getMinKey() {
		return minkey;
	}
	
	public static void main(String[] args) {
		CS232LinkedBinaryTree<String, Integer> tree = new CS232LinkedBinaryTree<>();
		tree.add("A", 5);
		tree.add("B", 3);
		tree.add("C", 8);
		tree.add("D", 1);
		tree.add("E", 4);
		tree.add("F", 7);
		tree.add("G", 10);
		tree.add("H", 0);
		tree.add("I", 6);
		tree.add("J", 9);
		
		MinKeyFinder mkf = new MinKeyFinder();

		tree.visitPreOrder(mkf);
		

	}
}
