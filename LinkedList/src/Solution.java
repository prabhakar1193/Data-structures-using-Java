import java.util.HashSet;

class Solution {
    public  static ListNode middleNode(ListNode head) {
        
        int length=0;
        while(head.next!=null)
        {
           length++; 
        }
        System.out.println(length);
		return head;
    }
    public static void main(String[] args) {
		HashSet<Integer> x= new HashSet<>();
		x.add(1);
		System.out.println(x);
	}
}