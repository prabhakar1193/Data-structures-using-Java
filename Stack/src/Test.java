
public class Test {
public static void main(String[] args) {
	
	Stack myStack= new Stack(1);
	myStack.push(2);
	myStack.push(0);
	myStack.printStack();
	myStack.pop();
	myStack.pop();
	System.out.println("-------");
	myStack.printStack();
}
}
