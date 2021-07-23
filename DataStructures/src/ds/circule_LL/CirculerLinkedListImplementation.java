/**
 * NAME : 012_AMOL BHARSAKLE_e-DAC
 */
package ds.circule_LL;

import java.util.Scanner;

public class CirculerLinkedListImplementation {

	public static void main(String[] args) {


			Scanner sc = new Scanner(System.in);
			int choice=0;
			CirculerLinkedList cll=new CirculerLinkedList();
			
			do {
				System.out.println("\nMAIN MENU");
				System.out.print(""
						+ "1.ADD FIRST"
						+ "\n2.ADD LAST"
						+ "\n3.DELETE FIRST"
						+ "\n4.DELETE LAST"
						+ "\n5.PRINT LIST"
						+ "\n0.EXIT"
						+ "\n----------------"
						+ "\nENTER YOUR CHOICE : ");
				choice=sc.nextInt();
				
				switch (choice) {
				case 1:
						System.out.print("\nEnter ELEMENT TO INSERT : ");
						cll.insertLeft(sc.nextInt());
						break;
				case 2:
						System.out.print("\nEnter ELEMENT TO INSERT : ");
						cll.insertRight(sc.nextInt());
						break;
				case 3:
						cll.deleteFirst();
						break;
				case 4:
						cll.deleteLast();
						break;
				
				case 5:
						cll.printCirculerLinkedList();
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
