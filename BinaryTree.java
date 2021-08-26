
/**
 * <br>Processing data using binary tree CST8130 Data Structures, 
 * <br>Computer Engineering Technology-Computer Science: Level 3
 * 
 * <br>Professor: James Mwangi PhD
 * 
 * 
 * <br>         Student Name: Younes Boutaleb
 * <br>			Student ID: 041019068
 * 
 * <br>	
 * <br>	
 * <br>CET - CS Academic Level 3
 * <br>Declaration: I declare that this is my own original work and is free from Plagiarism
 * <br>This class creates creates the binary tree
 * <br>Section #: 303
 * <br>Course: CST8130 - Data Structures
 * @author Younes Boutaleb.
 * @version 1.0
 */

public class BinaryTree {

	/**This is the top node in the created  binary tree*/
	private BinaryTreeNode root = null;

	/**
	 * This method recursively insert a new node in the binary tree
	 * @param newData This is the data to store in the new inserted  node
	 */
	public void insertInTree (int newData) {

		//insert a new node in the current node if it's null
		if (root == null)
			root = new BinaryTreeNode(newData);

		else
			//call insert method to insert the new node at the right or at the left of the current node
			root.insert(newData);

	}//end insertInTree

	/**
	 * This method display the tree data in a PreOrder traversal starting from root node
	 */
	public void displayPreOrder () {

		displayPreOrder (root);

	}//end displayPreOrder

	/**
	 * Traverse a sub-tree using PreOrder algorithm and display the content to the consol
	 */
	private void displayPreOrder (BinaryTreeNode subRoot){

		if (subRoot == null)
			return;

		System.out.print(subRoot.getData() + " ");		
		displayPreOrder(subRoot.getLeft() );
		displayPreOrder(subRoot.getRight() );
	}//end displayPreOrder

	/**
	 * this method calculates the tree height starting from root node
	 */
	public void calculateHeight() {

		System.out.print(calculateHeight(root));


	}//end calculateHeight


	/**
	 * this method calculates a sub-tree height starting from a specific node
	 * @param subRoot is the top node of the current sub-tree
	 * @return Returns the height of the current sub tree
	 */
	private int calculateHeight(BinaryTreeNode subRoot) {


		if (subRoot == null)
			return 0;

		//Recursively iterates through the subtree levels until it reaches the bottom level (node =null) 
		int leftHeight = calculateHeight(subRoot.getLeft());
		int rightHeight= calculateHeight(subRoot.getRight());

		//it returns 0 for the bottom subtree then goes up to sub-level
		//adds one to the height of the sub-tree which has the highest then return it
		if (leftHeight>rightHeight)
			return leftHeight +1;
		else 
			return rightHeight +1;

	}//end calculateHeight


}//end class
