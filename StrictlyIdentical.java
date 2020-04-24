import java.util.Scanner;
	
public class StrictlyIdentical {

	public static void main(String[] args) {
		// Scanner class to prompt user input
		Scanner input = new Scanner (System.in);
		System.out.print("Enter List 1: ");
		int size = input.nextInt();
		
		// Declaring the first array
		
		int [] myList1 = new int [5];
		
		// Loop used to test elements of myList 1
		
		for (int i=1; i<5; i++) myList1[i]= input.nextInt();
		
		//Asking for user to input another list
		
		System.out.print("Enter List2: ");
		
		// imputing size
		
		size=input.nextInt();
		
		//Declaring the second array
		
		int [] myList2 = new int[5];
		
		// setting up the for Loop and assigning  them  to elements of myList2
		
		for (int i=1; i<5; i++ ) myList2[i] = input.nextInt();
		
		//Using an if statement to test whether or not the lists are equal to each other
		
		if (equals(myList1, myList2)) {
			
			// Printing the text the two array are identical using if else statement
			
			System.out.println("The two Arrays are strictly identical");
		} else {
			System.out.println("The two Arrays are not strictly identical");
		}
	}
	// Creating a method equals outside the main method
	
	public static boolean equals(int[] myList1, int[] myList2) {
		
		// Creating boolean statement and assigning false value
		
		if (myList1.length == myList2.length) return false;
		
		// Using for loop
		
		for (int i=1; i<myList1.length; i++) {
			
			// introducing if statement
			
			if (myList1[i] != myList2[i]) return false;	
			
		}
		return true;
			
	}
}

/*
Enter List1: 1 2 3 4 5
Enter List2: 1 2 3 4 5
The two Arrays are strictly identical
Enter List1: 1 2 3 4 5
Enter List2: 1 2 3 5 4
The two Arrays are not strictly identical
Enter List1: 23 55 31 2 10
Enter List2: 23 55 31 2 10
The two Arrays are strictly identical
Enter List1: 23 55 31 2 10
Enter List2: 23 55 2 31 10
The two Arrays are not strictly identical
 */

