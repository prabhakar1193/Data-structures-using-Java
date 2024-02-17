import java.util.Iterator;

public class Stack {

	Node top;
	int lenght;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		lenght++;

	}

	public void printStack() {
		Node temp = top;
		for (int i = 0; i < lenght; i++) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void push(int value) {
		Node newNode = new Node(value);
		if (lenght == 0) {
			top = newNode;

		} else {
			newNode.next = top;
			top = newNode;

		}
		lenght++;
	}

	public boolean pop() {
		if (lenght == 0) {
			return false;
		}

		top = top.next;
		lenght--;
		if (lenght == 0) {
			top = null;
		}
		return true;
	}

}
