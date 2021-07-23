package interview_quetions;



public class DoublyLinkedListIQ {
	class Node{
		Node left;
		int data;
		Node right;
		
	public	Node(int data) { this.data=data; }
	}
	
	Node root;
	
	public DoublyLinkedListIQ() { System.out.println("DOUBLY-LINKED-LIST IS CREATED"); }
	
	
	//ADD FIRST 
	public void insertLeft(int data) {
		Node n = new Node(data);
		if(root==null) {
			root=n;
		}else {
			n.right=root;
			root.left=n;
			root=n;
		}
	}
	
	//ADD LAST
	public void insertRight(int data) {
		Node n = new Node(data);
		if(root==null) {
			root=n;
		}else {
			Node t = root;
			while(t.right!=null)
				t=t.right;
			t.right=n;
			n.left=t;
			
		}
	}
	
	//DELETE LEFT
	public void deleteLeft() {
		if(root==null)
			System.out.println("List is EMPTY");
		else if(root.right==null) {
			System.out.println("DELETED : "+root.data);
			root=null;
		}
		else {
			Node t=root;
			System.out.println("DELETE : "+t.data);
			t=t.right;
			t.left=null;
			root=t;
			printDoublyLinkedList();
			
		}
	}
	
	//DELETE RIGHT
	public void deleteRight() {
		if(root==null)
			System.out.println("List is EMPTY");
		else if(root.right==null) {
			System.out.println("DELETED : "+root.data);
			root=null;
		}
		else {
			Node t =root;
			Node t2=t;
			while(t.right!=null) {
				t2=t;
				t=t.right;
			}
			t2.right=null;
			System.out.println("DELETED : "+t.data);
			printDoublyLinkedList();
		}
	}
	
	//PRINT LIST
	public void printDoublyLinkedList() {
		System.out.println("------------------\n");
		if(root==null)
			System.out.print("LIST IS EMPTY");
		else {
			Node t=root;
			while(t!=null) {
				System.out.print(t.data+", ");
				t=t.right;
			}
			
		}
		
		System.out.println("\n------------------");
		
	}
	
	
	///////////////////////////////////////
	/////// FINDING MID OF DLL ////////////
	///////////////////////////////////////
	public void findMidOfDLList() {
		
		
		
		////////////THIS CODE IS RUNNING WITH ANY NUMBER OF NODES 
		if(root==null)
			System.out.println("DLL is EMPTY");
		else {
			int mid=0;
			Node beg=root;
			Node end=root;
			
			while(end.right!=null) {
				end=end.right;
				mid++;
			}
			mid=mid/2;
			while(beg.right!=null && end.left!=null) {
				if(mid--==0)
					break;
				System.out.println("BEG:"+beg.data+" ,| END:"+end.data);
				beg=beg.right;	end=end.left;
				
			}
			System.out.println("\n\nMID POINT ELEMENT : "+beg.data);
		}
		
		
		
		
		
////////////THIS CODE IS RUNNING WITH ONLY ODD NUMBER OF NODES 
		
//		if(root==null)
//			System.out.println("DLL is EMPTY");
//		else {
//			int total=0;
//			Node beg=root;
//			Node end=root;
//			while(end.right!=null) {
//				end=end.right;
//				total++;
//			}
//			while(beg!=end) {
//				System.out.println("BEG:"+beg.data+" ,| END:"+end.data);
//				beg=beg.right;	end=end.left;
//			}
//			System.out.println("\n\nMID POINT ELEMENT : "+beg.data);
//			System.out.println("MID POINT ELEMENT : "+end.data);
//		}
		
	}
	
	
	
	
	

}