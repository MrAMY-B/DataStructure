package ds.circule_LL;

public class CirculerLinkedList {
	
	class Node{
		int data;
		Node next;
		public Node(int data) { this.data=data;  }
	}
	
	Node root;
	Node last;
	
	public CirculerLinkedList() { System.out.println("LIST IS CREATED"); }
	
	//ADD FIRST
	public void insertLeft(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=last=n;
			last.next=root;
		}
		else {
			n.next=root;
			root=n;
			last.next=root;
		}
	}
	
	
	//ADD LAST
	public void insertRight(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=last=n;
			last.next=root;
		}
		else {
			n.next=root;
			last.next=n;
			last=n;
		}
	}
	
	
	//DELETE FIRST
	public void deleteFirst() {
		if(root==null)
			System.out.println("List is EMPTY");
		else if(root==last)
			root=last=null;
		else {
			int data=root.data;
			root=root.next;
			last.next=root;
			System.out.println("FIRST Element is DELETED : "+data);
		}
	}
	//DELETE LAST
	public void deleteLast() {
		if(root==null)
			System.out.println("List is EMPTY");
		else if(root==last)
			root=last=null;
		else {
			
			Node t=root;
			Node t2=null;
			while(t!=last) {
				t2=t;
				t=t.next;
			}
			System.out.println("LAST Element is DELETED : "+t.data);
			t2.next=root;
			last=t2;
			
		}
	}
	//PRINT STACK
	public void printCirculerLinkedList() {
		System.out.println("-------------------------");
		if(root==null)
			System.out.println("LIST IS EMPTY");
		else {
			Node t=root;
			do {
				System.out.print(t.data+", ");
				t=t.next;
			}while(t!=root);
			
		}
		System.out.println("\n-------------------------");
	}
	

	
}



















