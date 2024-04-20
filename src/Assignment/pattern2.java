package Assignment;

public class pattern2 {

	
	    public static void main(String[] args) {
	        printNumberPattern(5);
	    }

	    public static void printNumberPattern(int rows) {
	        int num = 1; // Starting number for the pattern

	        // Loop through each row of the pattern
	        for (int i = 1; i <= rows; i++) {
	            // Loop to print numbers for the current row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println(); // Move to the next line after printing each row
	        }
	    }
	}



