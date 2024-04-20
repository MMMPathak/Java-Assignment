package Assignment;

public class Pattren3 {
	

	    public static void main(String[] args) {
	        int numRows = 5; // Number of rows for Pascal's Triangle
	        printPascalTriangle(numRows);
	    }

	    public static void printPascalTriangle(int numRows) {
	        // Iterate through each row of Pascal's Triangle
	        for (int i = 0; i < numRows; i++) {
	            // Print spaces to right-align the numbers
	            for (int j = 0; j < numRows - i; j++) {
	                System.out.print("  ");
	            }

	            int number = 1; // Initialize the first number in the row

	            // Calculate and print the numbers for the current row
	            for (int j = 0; j <= i; j++) {
	                System.out.print(String.format("%4d", number) + " "); // Print formatted number
	                number = number * (i - j) / (j + 1); // Calculate the next number
	            }

	            System.out.println(); // Move to the next line after printing the row
	        }
	    }
	}


