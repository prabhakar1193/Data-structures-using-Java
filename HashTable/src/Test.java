
public class Test {
	public static void main(String[] args) {
		HashTable myHashTable= new HashTable();
		myHashTable.set("abc", 50);
		myHashTable.set("xyz", 0);
		myHashTable.printTable();
		System.out.println("Value for abc is : "+myHashTable.get("abc"));
		System.out.println(myHashTable.getKeys());
	}
}
