
public class Test {
	public static void main(String[] args) {
		BST myBST= new BST();
		myBST.insert(4);
		myBST.insert(7);
		myBST.insert(8);
		myBST.insert(6);
		
		System.out.println(myBST.contains(1));
	}
}
