package ds.priority_queue;

import java.util.Scanner;

public class PriorityQueueImplementation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.print("Enter the size of the queue : ");
		PriorityQueue q = new PriorityQueue(sc.nextInt());
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println(""
					+ "1.ENQUEUE ELEMENT"
					+ "\n2.DEQUEUE ELEMENT"
					+ "\n3.GET FRONT ELEMENT"
					+ "\n4.GET REAR ELEMENT"
					+ "\n5.PRINT QUEUE"
					+ "\n0.EXIT");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
					if(q.isFull())
						System.out.println("QUEUE IS FULL CAN'T ADD");
					else {
						System.out.print("ENTER ELEMENT TO ADD : ");
						q.enqueue(sc.nextInt());
					}
					break;
			case 2:
					if(q.isEmpty())
						System.out.println("QUEUE IS EMPTY CAN'T REMOVE");
					else
						 System.out.println("DEQUEUED ELEMENT is:"+q.dequeue()); 
					break;
			case 3:
					System.out.println("FRONT ELEMENT : "+q.getFront());
					break;
			case 4:
					System.out.println("REARE ELEMENT : "+q.getRear());
					break;
			
			case 5:
				if(q.isEmpty())
					System.out.println("QUEUE IS EMPTY");
				else
					q.printPriorityQueue();
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
