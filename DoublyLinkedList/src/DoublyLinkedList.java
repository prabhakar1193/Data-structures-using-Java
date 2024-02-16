import java.util.Iterator;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node previous;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;

	}

	public void printList() {
		if (length == 0) {
			System.out.println("null");
			return;
		}

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.previous = tail;
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		tail = tail.previous;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		temp.previous = null;
		return temp;

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			Node temp = head;
			temp.previous=head;
			head = newNode;
			head.next = temp;
			length++;

		}
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		} else {
			Node tempNode = head;
			head = head.next;
			head.previous = null;
			tempNode.next = null;
			length--;
			if (length == 0) {
				head = null;
				tail = null;
			}
			return tempNode;
		}
	}

	public Node get(int index) {
		if (length <= index || index < 0) {
			return null;
		}

		if (index < length / 2) {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		} else {
			Node temp = tail;
			for (int i = length - 1; i > index; i--) {
				temp = temp.previous;
			}
			return temp;
		}
	}

	public boolean set(int index, int value) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = value;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int value) {
		if (index == 0) {
			prepend(value);
			return true;
		} else if (index == length) {
			append(value);
			return true;
		} else {
			Node newNode = new Node(value);
			Node temp = get(index - 1);
			if (temp != null) {
				newNode.previous = temp;
				newNode.next = temp.next;
				temp.next = newNode;
				return true;
			}
			return false;
		}
	}

	public boolean remove(int index) {
		if (index == 0) {
			removeFirst();
			return true;
		} else if (index == length) {
			removeLast();
			return true;
		} else {
			Node temp = get(index-1);
			if (temp != null) {
				temp.next = temp.next.next;
				return true;
			}
			return false;
		}

	}
}
