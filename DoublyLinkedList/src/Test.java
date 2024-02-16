
public class Test {
	public static void main(String[] args) {
		DoublyLinkedList myList = new DoublyLinkedList(13);

		myList.append(11);
		myList.append(19);
		myList.append(14);
		System.out.println("-----Printing List Start-----");
		myList.printList();
		System.out.println("-----Printing List End-----");
		System.out.println("-----Removing Last Element-----");
		myList.removeLast();
		System.out.println("-----List after removing last-----");
		myList.printList();
		System.out.println("----------");
		myList.prepend(1);
		System.out.println("-----List after prepending-----");
		myList.printList();
		System.out.println("----------");
		myList.removeFirst();
		System.out.println("-----List after removing first-----");
		myList.printList();
		System.out.println("----------");
		System.out.println(myList.get(2).value);
		System.out.println("----------");
		myList.set(0, 1);
		System.out.println("----------");
		myList.printList();
		myList.insert(0, 0);
		System.out.println("----------");
		myList.printList();
		myList.remove(1);
		System.out.println("----------");
		myList.printList();
		
		
		

	}
}
