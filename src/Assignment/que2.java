package Assignment;

import java.util.ArrayList;

public class que2 {
	public static void main(String[] args) {
		
	
 ArrayList<String> s= new ArrayList<>();
 s.add("Hello");
 s.add("java");
 s.add("Bye");
 
 for(String s1 : s) {
	 System.out.println(s1);
 }
 
 int left=0;
 int right=s.size()-1;
 
 while(left<right) {
	 String temp= s.get(left);
	 s.set(left, s.get(right));
	 s.set(right, temp);
	 
	 left++;
	 right--;
 }
 System.out.println(s);
	}
}
