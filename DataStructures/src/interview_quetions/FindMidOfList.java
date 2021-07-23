package interview_quetions;

public class FindMidOfList {

	public static void main(String[] args) {

		DoublyLinkedListIQ dll=new DoublyLinkedListIQ();
		dll.insertRight(10);
		dll.insertRight(20);
		dll.insertRight(30);
		dll.insertRight(40);
		dll.insertRight(50);
		dll.insertRight(60);
		dll.insertRight(70);
		dll.insertRight(80);
		
		
		dll.printDoublyLinkedList();
		System.out.println("\n\n");
		dll.findMidOfDLList();
		
	
	}

}
