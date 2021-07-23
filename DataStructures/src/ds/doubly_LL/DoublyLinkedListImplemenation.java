package ds.doubly_LL;

import java.util.Scanner;

public class DoublyLinkedListImplemenation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice=0;
		DoublyLinkedList dll = new DoublyLinkedList();
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println(""
					+ "1.ADD ELEMENT AT LEFT"
					+ "\n2.ADD ELEMENT AT RIGHT"
					+ "\n3.DELETE ELEMENT FROM LEFT"
					+ "\n4.DELETE ELEMENT FROM RIGHT"
					+ "\n5.PRINT LINKED LIST"
					+ "\n0.EXIT");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
						System.out.print("ENTER ELEMENT TO ADD : ");
						dll.insertLeft(sc.nextInt());
					
					break;
			case 2:
					System.out.print("ENTER ELEMENT TO ADD : ");
					dll.insertRight(sc.nextInt());
			
					break;
			case 3:
					dll.deleteLeft();
					break;
			case 4:
					dll.deleteRight();
					break;
			
			case 5:
					dll.printDoublyLinkedList();
					break;
			case 0:
					System.out.println("BYE BYE...");
					break;

			default:
					System.out.println("WRONG CHOICE");
				break;
			}
			
		}while(choice!=0);
		
		
		sc.close();
	}

}
