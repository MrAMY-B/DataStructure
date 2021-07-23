package ds.stack;

import java.util.Scanner;

public abstract class StackImplementation {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.print("Enter the size of the STACK : ");
		Stack st = new Stack(sc.nextInt());
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println("1. PUSH ELEMENT"
					+ "\n2.POP ELEMENT"
					+ "\n3.GET PEAK ELEMENT"
					+ "\n4.PRINT STACK"
					+ "\n0.EXIT");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
					if(st.isFull())
						System.out.println("STACK IS FULL CAN'T ADD");
					else {
						System.out.println("ENTER ELEMENT TO PUSH");
						st.push(sc.nextInt());
					}
					break;
			case 2:
					if(st.isEmpty())
						System.out.println("STACK IS EMPTY CAN'T POP");
					else
						 System.out.println("POPED ELEMENT is:"+st.pop()); 
					break;
			case 3:
					if(st.isEmpty())
						System.out.println("STACK IS EMPTY");
					else
						System.out.println("PEAK ELEMENT IS:"+st.peak());
					break;
			case 4:
				if(st.isEmpty())
					System.out.println("STACK IS EMPTY");
				else
					st.printStack();
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
