package ds.tree;

import java.util.Scanner;

import ds.tree.Tree.Node;

public class TreeImplementation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice=0;
		Tree tree = new Tree();
		System.out.println("Enter root node");
		Node root = tree.new Node(sc.nextInt());
		
		
		do {
			System.out.println("\nMAIN MENU");
			System.out.println(""
					+ "1.INSERT DATA"
					+ "\n2.DELETE DATA"
					+ "\n3.PRINT PREORDER"
					+ "\n4.PRINT INORDER"
					+ "\n5.PRINT POSTORDER"
					+ "\n6.PRINT HEIGHT OF TREE"
					+ "\n0.EXIT");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
						System.out.print("ENTER ELEMENT TO ADD : ");
						tree.addNode(root, sc.nextInt());
					
					break;
			case 2:
					System.out.print("ENTER ELEMENT TO DELETE : ");
					tree.deleteNode(root, sc.nextInt());
					
			
					break;
			case 3:
					tree.printPreOrder(root);
					break;
			case 4:
					tree.printInOrder(root);
					break;
			
			case 5:
					tree.printPostOrder(root);
					break;
			case 6:
				System.out.println(" Height of tree is : "+tree.findHieghtOfTree(root));
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

