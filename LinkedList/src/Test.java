
public class Test {
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(10);
		// myLinkedList.printList();
		
		myLinkedList.append(20);
		myLinkedList.prepend(5);
		myLinkedList.printList();
		myLinkedList.reverse();
		
		

		myLinkedList.printList();

	}
}
