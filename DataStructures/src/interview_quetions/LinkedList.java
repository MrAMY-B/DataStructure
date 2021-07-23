package interview_quetions;

import ds.stack.Stack;

public class LinkedList {

	class Node{
		int data;
		Node next;
		
		public Node(int data){ this.data=data; } 
	}
	
	Node root;
	
	public LinkedList() {
		System.out.println("Linked List Created");
		root=null;
	}
	
	//INSERT-RIGHT
	public void insertLeft(int data) {
		Node n=new Node(data);
		if(root==null)
			root=n;
		else {
			n.next=root;
			root=n;
			System.out.println("ADDED TO LEFT");
		}
	}
	
	//INSERT-RIGHT
	public void insertRight(int data) {
		Node n=new Node(data);
		if(root==null)
			root=n;
		else {
			Node t=root;
			while(t.next!=null)
				t=t.next;
			t.next=n;
			System.out.println("ADDED TO RIGHT : "+data);
		}
	}
	
	public void printList() {
		if(root==null ) 
			System.out.println("EMPTY LIST");
		else {
			Node t=root;
			while(t!=null) {
				System.out.print(t.data+", ");
				t=t.next;
			}
				
		}
	}
	//////////////////////////////////
	///// SORTIG LINKED LIST ////////
	/////////////////////////////////
	public void sortLinkedList() {
		if(root==null || root.next==null) 
			System.out.println("ALREADY SORTED LIST");
		else {
			Node t1=root;
			Node t2=root.next;
			int ow=0,iw=0;

			while(t1.next!=null) {
				ow++;
				t2=t1.next;
				while(t2!=null) {
					iw++;
					if(t1.data>t2.data) {
						int temp=t1.data;
						t1.data=t2.data;
						t2.data=temp;
					}
					t2=t2.next;	
				}
				t1=t1.next;
			}
			System.out.println("\n-------------------------------------------------");
			System.out.println("Inner While COUNT :"+iw+", Outer While COUNT:"+ow);
			printList();
		
		}
	}

	//////////////////////////////////
	///// MERGEING TWO SORTED LIST //
	/////////////////////////////////
	public  LinkedList mergeTwoLinkedist(LinkedList ll1,LinkedList ll2){
		
		LinkedList ll3=new LinkedList();
		
		if(ll1.root==null && ll2.root==null)
			return ll3;
		else if(ll1.root==null)
			return ll2;
		else if(ll2.root==null)
			return ll1;
		else {
			Node t1=ll1.root; Node t2=ll2.root; Node t3=null;
			
			while(t1!=null && t2!=null) {

				if(t1.data<t2.data) {
					ll3.insertRight(t1.data);
					t1=t1.next;
				} 
				else{
					ll3.insertRight(t2.data);
					t2=t2.next;
				}
			}
			if(t1==null) { t3=t2; } else if(t2==null){ t3=t1; }
			while(t3!=null) {
				ll3.insertRight(t3.data);
				t3=t3.next;
			}
		}
		
		return ll3;
	}
	/////////////////////////////////
	/// COUNTING THE LIST LENGTH ////
	/////////////////////////////////
	public int countLength() {
		int length=0;
		if(root==null)
			return 0;
		else {
			Node t=root;
			while(t!=null) {
				length++;
				t=t.next;
			}
		}
		return length;
	}
	
	/////////////////////////////////
	//// REVERSE LINKED LIST ////////
	/////////////////////////////////
	public void reverseList() {
		
		if(root==null)
			System.out.println("List is EMPTY");
		else if(root.next==null)
			System.out.println(root.data);
		else {
			Stack stack = new Stack(countLength());
			Node t1=root;
			Node t2=root;
			while(t1!=null) {
				stack.push(t1.data);
				t1=t1.next;
			}
			while(t2!=null) {
				t2.data=stack.pop();
				t2=t2.next;
			}
			printList();
		}
			
		
		
		
	}
}









