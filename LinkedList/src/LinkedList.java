
public class LinkedList {
	Node head;
	Node tail;
	int length = 0;

	class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);

		head = newNode;
		tail = newNode;
		length++;
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
			length = 1;
		} else {
			tail.next = newNode;
			tail = newNode;
			length++;
		}

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			tail = newNode;
			length = 1;
		} else {
			Node temp = head;
			head = newNode;
			head.next = temp;
			length++;
		}
	}

	public Node removeLast() {
		Node temp = head;
		Node pre = head;
		if (length == 0) {
			return null;
		}
		while (temp.next != null) {

			pre = temp;
			temp = temp.next;
		}

		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return null;
	}

	public Node removeFirst() {
		if (length == 0) {
			return null;
		}
		Node temp = head;
		head = head.next;
		length--;
		temp.next = null;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		Node temp = head;
		if (index >= length || index < 0) {
			return null;
		}
		for (int i = 0; i < index; i++) {
			temp = temp.next;

		}
		return temp;
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
		}

		else if (index == length) {
			append(value);
			return true;
		} else {
			Node temp = get(index - 1);
			if (temp == null) {
				return false;
			}
			Node newNode = new Node(value);
			newNode.next = temp.next;
			temp.next = newNode;
			length++;
			return true;

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
			Node preNode = get(index - 1);
			if (preNode != null) {
				Node tempNode = preNode.next;
				preNode.next = tempNode.next;
				return true;
			}

			return false;

		}

	}

	public void reverse() {
		Node tempHead = tail;
		for (int i = (length - 2); i >= 0; i--) {
			Node tempNode = get(i);
			tempHead.next = tempNode;
			tempHead = tempNode;
		}
		Node temp1 = head;
		this.head = tail;
		this.tail = temp1;
		tail.next = null;

	}
}
