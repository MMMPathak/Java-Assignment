import java.util.Scanner;

public class month {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num1");

		int n1=sc.nextInt();
		System.out.println("enter number2");
		int n2=sc.nextInt();
		
		System.out.println("enter operator");
	     String str=sc.next();
	
	 switch(str) {
	        
	 case "+":
		int sum= n1+n2;
		System.out.println(sum);
		 break;
	 case "-":
		 int result=n1-n2;
		 System.out.println(result);
		 break;
		 
	 case "*":
		 int result1=n1*n2;
		 System.out.println(result1);
		 break;
		 
	 case "/":
		 int val=n1/n2;
		 System.out.println(val);
		 break;
		 
		 
	      
	 
	 }
	
	sc.close();
	}

}
