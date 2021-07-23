package ds.tree;

import ds.tree.Tree.Node;

public class TreeImpl {

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		Node root=tree.new Node(13);
		
		tree.addNode(root, 4);
		tree.addNode(root, 9);
		tree.addNode(root, 22);
		tree.addNode(root, 43);
		tree.addNode(root, 7);
		
		tree.printInOrder(root);
		System.out.println();
		tree.printPreOrder(root);
		System.out.println();
		tree.printPostOrder(root);
		System.out.println("----------------");
		System.out.println("Total Nodes are : "+tree.countAllNodes(root));
		System.out.println("TOTAL LEAF NODES : "+tree.countAllLeafNoad(root));
		System.out.println(" Height of tree is : "+tree.findHieghtOfTree(root));
		
		
		

	}

}
