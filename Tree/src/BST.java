public class BST {

	Node root;

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return false;
		}
		Node temp = root;
		while (true) {
			if (newNode.value == temp.value) {
				return false;
			} else if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;

			}
		}

	}

	public boolean contains(int value) {
		Node temp = root;
		while (temp != null) {

			if (value == temp.value) {
				return true;
			} else if (value < temp.value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}

		}
		return false;
	}

}
