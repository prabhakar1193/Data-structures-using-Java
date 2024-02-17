
public class Queue {
	private Node first;
	private Node last;
	int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length++;
	}

	public void enQueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;

		} else {
			last.next = newNode;
			last = newNode;

		}
		length++;
	}

	public boolean deQueue() {
		if (length == 0) {
			return false;
		}
		first = first.next;
		length--;
		if (length == 0) {
			first = null;
			last = null;
		}
		return true;
	}
}
