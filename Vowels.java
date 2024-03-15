import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	System.out.println("enter char to check");
	Scanner sc= new Scanner(System.in);
	
	char c= sc.next().charAt(0);
	
	switch(c) {
	case 'a':
		System.out.println("Vowles");
		break;
	case 'e':
		System.out.println("Vowles");
		break;
	case 'i':
		System.out.println("Vowles");
		break;
	case 'o':
		System.out.println("Vowles");
		break;
		
	case 'u':
		System.out.println("Vowles");
		break;
	default :
		System.out.println("Not a vowels");
		
	}
	
	
	
}
}
