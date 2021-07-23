package interview_quetions;

import java.util.Scanner;

public class SortLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList ll=new LinkedList();
		int choice=0;
		
		do {
			
			System.out.println("\n----------------"
					+ "\n1.ADD LEFT"
					+ "\n2.ADD RIGHT"
					+ "\n3.COUNT LENGTH"
					+ "\n4.SORT"
					+ "\n5.PRINT"
					+ "\n0.EXIT");
			System.out.print("ENTER CHOICE : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
					System.out.println("ENTER ELEMENT");
					ll.insertLeft(sc.nextInt());
					break;
			case 2:
					System.out.println("ENTER ELEMENT");
					ll.insertRight(sc.nextInt());
					break;
			case 3:
					System.out.println("LENGTH : "+ll.countLength());
					break;
			case 4:
					System.out.println("SORTING");
					ll.sortLinkedList();
					break;
			case 5:
					System.out.println("PRINTING");
					ll.printList();
					break;
			case 0:
					System.out.println("0. BYE BYE");
					break;
					
			default:System.out.println("WRONG CHOICE");
					break;
					
			
			}
			
			
		}while(choice!=0);
		
		sc.close();
		
	}
	
	
}
