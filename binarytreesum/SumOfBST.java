package lab3.binarytreesum;

import java.util.*;

public class SumOfBST {
	ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		SumOfBST bst = new SumOfBST();
		NodesOfTree root = null;
		NodesOfTree newNode = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nodes in the BST?");
		int numOfNodes = sc.nextInt();
		for (int i = 0; i <numOfNodes; i++) {
			System.out.println("Enter the value of the node: ");
			newNode = new NodesOfTree(sc.nextInt());
			if (root == null)
				root = newNode;
			else
				bst.insert(root, newNode);
		}
		
		bst.inOrder(root);
		System.out.println("Enter the sum of nodes to be searched:");
		int sumOfNodes = sc.nextInt();

		boolean nodePairNotFound = true;
		for (int node1 : bst.list) {
			int node2 = sumOfNodes - node1;
			if (bst.list.contains(node2)) {
				nodePairNotFound = false;
				System.out.println("Pair is (" + node1 + "," + node2 + ")");
				break;
			}
		}
		if (nodePairNotFound)
			{System.out.println("Pair of nodes for given sum NOT found");}
		
	
	}

	private void inOrder(NodesOfTree root) {
		if (root != null) {
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}
	}

	private void insert(NodesOfTree root, NodesOfTree newNode) {
		if (newNode.data < root.data) {
			if (root.left == null) {
				root.left = newNode;
			} else {
				insert(root.left, newNode);
			}
		} else {
			if (root.right == null) {
				root.right = newNode;
			} else {
				insert(root.right, newNode);
			}
		}
	}

}
