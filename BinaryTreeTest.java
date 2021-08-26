import java.util.InputMismatchException;
import java.util.Scanner;

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
 * <br>This class Tests the BinaryTree and Node class.
 * <br>Section #: 303
 * <br>Course: CST8130 - Data Structures
 * @author Younes Boutaleb.
 * @version 1.0
 */

public class BinaryTreeTest {

	/**
	 * This main method creates a new Binare tree and calls the BinaryTree class methods on it
	 * @param args command line arguments
	 */
	public static void main(String[] args) {


		//This is the only scanner object declared in this program
		Scanner scanner = new Scanner(System.in).useDelimiter("\r\n");
		//This is an Binary tree object which defines  a new Binary tree
		BinaryTree demo = new BinaryTree();
		//This is the menu option chosen by the use
		int option = 0;
		//Input validation state(true/false)
		boolean valid ;

		//This loop continues until the user chose to exit the program
		while(option != 4) {

			valid=false;
			//if the user enters a non integer value the program displays an error message and loops back
			while(!valid) {

				showMenu();
				//validates integer input
				try {
					option = scanner.nextInt();
					valid=true;
				}catch(InputMismatchException ex) {
					System.out.println("Incorrect option");
					scanner.nextLine();
				}//end catch
			}//end while


			//This switch structure executes the user's choice when it's valid otherwise it displays an error message
			switch(option) {

			//adds a new element to the binary tree
			case 1:
				try {
					System.out.print("Enter an integer to add to the tree: ");
					int data = scanner.nextInt();
					demo.insertInTree(data);
				}catch(InputMismatchException ex) {
					System.out.println("Incorrect value. Please enter an integer");
					scanner.nextLine();
				}//end catch
				break;


				//Prints the tree data in a Pre-order Traversal
			case 2:
				System.out.println("Pre-order Tree Traversal");
				demo.displayPreOrder();
				break;

				//Displays the binary tree height
			case 3:
				System.out.println("Tree Height");
				demo.calculateHeight();
				break;

				//Exits the program
			case 4:
				System.out.println("Exiting...");
				break;

				//displays an error message in case of invalid option
			default:
				System.out.println("Incorrect option");
				break;

			}//end switch
		}//end while

		//Close the scanner object
		if(scanner != null)
			scanner.close();


	}//end main


	/**
	 * This method prints the main menu
	 */
	public static void showMenu()
	{
		//This displays the menu options 

		String formatSring="\n%d: Add Value to Tree";
		formatSring+="\n%d: Display Tree (Pre-order Traversal)";
		formatSring+="\n%d: Display Height";
		formatSring+="\n%d: To Exit\n";

		System.out.print(String.format(formatSring, 1,2,3,4)); 	
	}//end showMenu

}//end class

