import java.util.Scanner;
public class Grade {
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks");
		int mark=sc.nextInt();
		if(mark>75) {
			System.out.println("A");
			}
		else if (mark>65) {
			System.out.println("B");
			
		}
		else if(mark>50) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		
	}

}
