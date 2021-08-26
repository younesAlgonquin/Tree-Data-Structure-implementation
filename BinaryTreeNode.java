/**
 * <br>Processing data using binary tree CST8130 Data Structures, 
 * <br>Computer Engineering Technology-Computer Science: Level 3
 * <br>	
 * <br>CET - CS Academic Level 3
 * <br>This class creates a single Node of the binary tree.
 * <br>Section #: 303
 * <br>Course: CST8130 - Data Structures
 * @version 1.0
 */

public class BinaryTreeNode {

	/**This is the data to store in the new inserted  node*/
	private int data;
	/**The left node of the current node*/
	private BinaryTreeNode left;
	/**The right node of the current node*/
	private BinaryTreeNode right;

	/**
	 * This is the no-arg constructor which create a new node with value 0
	 */
	public BinaryTreeNode() {

		left=null;
		right=null;
	}//end no-arg constructor 

	/**
	 * This a parameterized constructor which creates a new node to store data
	 * @param data This is the data to store in the new created node 
	 */
	public BinaryTreeNode(int data) {

		left=null;
		right=null;
		this.data=data;
	}//end  parameterized constructor

	/**
	 * This is data getter
	 * @return Returns the node data
	 */
	public int getData() {

		return data;
	}//end getData


	/**
	 * This is left node getter
	 * @return Returns the left node
	 */
	public BinaryTreeNode getLeft() {

		return left;
	}//end BinaryTreeNode

	/**
	 * This is right node getter
	 * @return Returns the right node
	 */
	public BinaryTreeNode getRight() {

		return right;
	}//end getRight


	/**
	 * This method inserts a new node in the tree
	 * @param newData This is the data to store in the new created node 
	 */
	public void insert (int newData) {

		//insert the node to the left of the current node if it's null
		if(newData<data) {

			if (left==null)
				left= new BinaryTreeNode(newData);

			//calls the insert method on the left node of the current node if it's not null
			else
				left.insert(newData);
		}
		else if(newData>data) {
			//insert the node to the right of the current node if it's null
			if (right == null)
				right = new BinaryTreeNode(newData);
			//calls the insert method on the right node of the current node if it's not null
			else
				right.insert(newData);
		}
		//display a error message if newData already exists
		else
			System.out.println("Duplicate – not adding " + newData);

	}//end insert


}//end class
