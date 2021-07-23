import java.util.Scanner;

public class MenuDrivenSnipped {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int choice=0;
	
	do {
		
		System.out.println("\n----------------"
				+ "\n1."
				+ "\n2."
				+ "\n3."
				+ "\n4."
				+ "\n5"
				+ "\n0.EXIT");
		System.out.print("ENTER CHOICE : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
				System.out.println("1");
				break;
		case 2:
				System.out.println("2");
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
