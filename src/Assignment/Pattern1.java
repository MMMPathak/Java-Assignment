package Assignment;

public class Pattern1 {


	    public static void main(String[] args) {
	        printPattern();
	    }

	    public static void printPattern() {
	        int size = 5; // Size of the triangle (number of rows)

	        // Loop through each row
	        for (int i = 0; i < size; i++) {
	            // Print spaces to align the triangle to the right
	            for (int j = 0; j < size - i - 1; j++) {
	                System.out.print(" ");
	            }

	            // Print the first asterisk for each row
	            System.out.print("*");

	            // Print spaces inside the triangle
	            if (i > 0) {
	                for (int k = 0; k < 2 * i - 1; k++) {
	                    System.out.print(" ");
	                }
	                // Print the last asterisk for each row, except the bottom row
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        // Print the base of the triangle (row of asterisks)
	        for (int i = 0; i < 3 * size - 1; i++) {
	            System.out.print("*");
	        }
	        System.out.println(); // Move to the next line
	    }
	}
