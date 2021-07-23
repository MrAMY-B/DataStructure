package ds.tree;

public class Tree {
	
	public class Node{ 
		Node left; int data; Node right;
		public Node(int data) { this.data=data;}
	}
	
	Node root;
	
	public Tree() {
		this.root=null;
		System.out.println("Tree is created");
	}
	
	
	//INSERT TO TREE
	public void addNode(Node r,int data) {
		Node n = new Node(data);
		this.root=r;
		if(this.root==null)
			this.root=n;
		else {
			if(data<root.data)
				if(root.left==null)
					root.left=n;
				else
					addNode(root.left,data);
			else {
				if(root.right==null)
					root.right=n;
				else
					addNode(root.right, data);
			}
		}
	}
	
	
	
	public void printPreOrder(Node r) {
		if(r!=null) {
			System.out.print(r.data+", ");
			printPreOrder(r.left);
			printPreOrder(r.right);
		}
	}
	
	public void printInOrder(Node r) {
		if(r!=null) {
			printInOrder(r.left);
			System.out.print(r.data+", ");
			printInOrder(r.right);
		}
	}
	
	public void printPostOrder(Node r) {
		if(r!=null) {
			
			printPostOrder(r.left);
			printPostOrder(r.right);
			System.out.print(r.data+", ");
		}
	}
	
	public int countAllNodes(Node r) {
		int count=0;
		if(r!=null){
			System.out.println(r.data);
			count++;
			count=count+countAllNodes(r.right);
			count=count+countAllNodes(r.left);
		}
		return count;
	}
	
	public int countAllLeafNoad(Node r) {
		int count=0;
		if(r!=null) {
			if(r.left==null && r.right==null) {
				System.out.print(r.data+", ");
				count++;
			}else {
			count=count+countAllLeafNoad(r.left);
			count=count+countAllLeafNoad(r.right);
			}
		}
		return count;
	}
	
	//height of the tree
	public int findHieghtOfTree(Node r) {
		if(r==null) 
			return 0;
		if(r.left==null && r.right==null)
			return 0;
		else {
			
			int left=1,right=1;
			if(r.left!=null)
				left=left+findHieghtOfTree(r.left);
			if(r.right!=null)
				right=right+findHieghtOfTree(r.right);
			if(left>right)  
				return left; 
			else 
				return right;
		}
		
	}
	
//------NOT YET COMPLETED
	public Node findNearest(Node r) {
		
		if(r.left!=null)
			return findNearest(r.left);
		return r;
	}
	
		//DELETE NODE
		public void deleteNode(Node r,int data) {
			Node refNode=null;
			
			if(r==null)
				System.out.println("TREE IS EMPTY");
			else {
				if(data<r.data && r.left!=null) {		//data is lesser then root
					deleteNode(r.left,data);
				}else if(data>r.data && r.right!=null){	//data is greater then root
					deleteNode(r.right,data);
				}
				else if(r.data==data) {					//data found
					
					if(r.left==null && r.right==null) {
						System.out.println(" 1 .ELEMENT DELETED : "+r.data);
						r.data=0;
						r=null;
						
					}else if(r.left!=null && r.right==null) {
						System.out.println(" 2 .ELEMENT DELETED : "+r.data);
						r.data=0;
						r=r.left;
						
					}else if(r.left==null && r.right!=null) {
						System.out.println(" 3.ELEMENT DELETED : "+r.data);
						r.data=0;
						r=r.right;
						
					}else {
						refNode=findNearest(r.right);
						System.out.println(" 4.ELEMENT DELETED : "+r.data);
						r.data=refNode.data;
						if(refNode.right!=null) {
							refNode=refNode.right;
						}
					}
					
					
					
					
					
				}
				else
					System.out.println("ELEMENT DOESNT EXITS..");
					
			}
		}
	
	//DELETE NODE
//	public void deleteNode(Node r,int data) {
//		Node refNode=null;
//		
//		if(r==null)
//			System.out.println("TREE IS EMPTY");
//		else {
//			if(r.data==data) {
//				if(r.left==null && r.right==null) {
//					r=null;
//					System.out.println("DELETED Data : "+data);
//				}
//				else if(r.left==null ){
//					refNode=findNearest(r.right);
//				}
//				else
//					refNode=findNearest(r.right);
//			}
//			else if(data<r.data) {
//				deleteNode(r.left,data);
//			}else if(data>r.data){
//				deleteNode(r.right,data);
//			}else
//				System.out.println("ELEMENT DOESNT EXITS..");
//				
//		}
//	}

}

















