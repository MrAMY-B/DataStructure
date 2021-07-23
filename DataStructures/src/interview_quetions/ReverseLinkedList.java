package interview_quetions;

public class ReverseLinkedList {

	public static void main(String[] args) {

		LinkedList ll1=new LinkedList();
		ll1.insertRight(11);
		ll1.insertRight(3);
		ll1.insertRight(25);
		ll1.insertRight(84);
		ll1.insertRight(19);
		ll1.insertRight(53);
		ll1.insertRight(42);
		ll1.insertRight(24);
		
		ll1.printList();
		System.out.println("\n\n");
		ll1.reverseList();
		System.out.println("\n\n");
		ll1.printList();

	}

}
