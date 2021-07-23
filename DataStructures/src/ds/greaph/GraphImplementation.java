package ds.greaph;

import java.util.Scanner;

public class GraphImplementation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		System.out.println("Enter how many elements/nodes are in graph");
		int n=sc.nextInt();
		Graph graph = new Graph(n);
		
		System.out.println("-------------");
		
		
		
		
		do {
			
			System.out.println("\n----------------"
					+ "\n1.DFS TRAVERSAL"
					+ "\n2.BFS TRAVERSAL"
					+ "\n3."
					+ "\n4"
					+ "\n0.EXIT");
			System.out.print("ENTER CHOICE : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:	System.out.println("ENTER STARTING POINT");
					graph.DFS(sc.nextInt());
					graph.resetVisited();
					break;
			case 2:	System.out.println("ENTER STARTING POINT");
					graph.BFS(sc.nextInt());
					graph.resetVisited();
					break;
			case 3:
					System.out.println("3");
					break;
			case 4:
					System.out.println("4");
					break;
			case 5:
					System.out.println("5");
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
