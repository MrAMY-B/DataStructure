package interview_quetions;

public class MergeTwoList {
	public static void main(String[] args)  {
		
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
		
		ll1.sortLinkedList();
		System.out.println("\n\n");
		
		LinkedList ll2=new LinkedList();
		ll2.insertRight(43);
		ll2.insertRight(17);
		ll2.insertRight(24);
		ll2.insertRight(31);
		ll2.insertRight(96);
		ll2.insertRight(57);
		ll2.insertRight(36);
		ll2.printList();

		ll2.sortLinkedList();
		System.out.println("\n\n");
		
		LinkedList ll3=ll2.mergeTwoLinkedist(ll1, ll2);
		ll3.printList();
		
	
	}
	
	
}
