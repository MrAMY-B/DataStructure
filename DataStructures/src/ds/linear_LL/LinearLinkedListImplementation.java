package ds.linear_LL;

import java.util.Scanner;

public class LinearLinkedListImplementation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice=0;
		LinearLinkedList q = new LinearLinkedList();
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println(""
					+ "1.ADD ELEMENT AT LEFT"
					+ "\n2.ADD ELEMENT AT RIGHT"
					+ "\n3.DELETE ELEMENT FROM LEFT"
					+ "\n4.DELETE ELEMENT FROM RIGHT"
					+ "\n5.PRINT LINKED LIST"
					+ "\n6.SORT THE LINKED LIST"
					+ "\n0.EXIT");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
						System.out.print("ENTER ELEMENT TO ADD : ");
						q.insertLeft(sc.nextInt());
					
					break;
			case 2:
					System.out.print("ENTER ELEMENT TO ADD : ");
					q.insertRight(sc.nextInt());
			
					break;
			case 3:
					q.deleteLeft();
					break;
			case 4:
					q.deleteRight();
					break;
			
			case 5:
					q.printLinkedList();
					break;
			case 6:
					q.sortLinkedList();
					q.printLinkedList();
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
