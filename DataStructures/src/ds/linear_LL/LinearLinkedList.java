package ds.linear_LL;

public class LinearLinkedList {
	
	public class Node{
		int data;
		Node next;
	}
	
	
	Node root;
	
	public LinearLinkedList() {
	}
	
	public void insertLeft(int data) {
		Node n = new Node();
		n.data=data;
		
		if(root==null)
			root=n;
		else {
			n.next=root;
			root=n;
		}
			
	}
	
	public void deleteLeft() {
		if(root==null)
			System.out.println("Linked List is EMPTY");
		else {
			Node t=root;
			root=root.next;
			System.out.println("DELETED : "+t.data);
		}
	}
	
	
	public void insertRight(int data) {
		Node n = new Node();
		n.data=data;
		if(root==null)
			root=n;
		else {
			Node t=root;
			while(t.next!=null)
					t=t.next;
			t.next=n;
		}
			
	}
	
	public void deleteRight() {
		if(root==null)
			System.out.println("Linked list is EMPTY");
		else if(root.next==null) {
				int data=root.data;
				root=null;
				System.out.println("DELETED : "+data);
		}
		else {
			Node t=root;
			Node tail=null;
			while(t.next!=null) {
					tail=t;
					t=t.next;
			}
			tail.next=null;
			System.out.println("DELETED : "+t.data);
		}
	}
	
	
	public void printLinkedList() {
		if(root==null)
			System.out.println("Linked list is EMPTY");
		else {
			Node t=root;
			while(t!=null) {
				System.out.print(t.data+", ");
				t=t.next;
			}
			
		}
			
	}
	
	public void sortLinkedList() {
		if(root==null)
			System.out.println("List is EMPTY");
		else {
			Node t=root;
			Node t2=root;
			while(t!=null) {
				t2=t.next;
				while(t2!=null) {
					if(t.data>t2.data) {
						int temp =t.data;
						t.data=t2.data;
						t2.data=temp;
					}
				t2=t2.next;
				}
			
			t=t.next;
			}
		}
	}
	
	
}
//---------------//ADT





























