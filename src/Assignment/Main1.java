package Assignment;
import java.util.HashSet;
public class Main1 {
public static void main(String[] args) {
	HashSet<String> h1= new HashSet<>();
	h1.add("Harry");
	h1.add("Raj");
	h1.add("Raghav");
	
	for(String s: h1) {
		System.out.println(s);
	}
	
	String[] arr= new String[h1.size()];
	h1.toArray(arr);
	System.out.println("Converting into array");

	for(String s: arr) {
		System.out.println(s);
	}
	
	//clearing the hashset
	h1.clear();
	System.out.println(h1);
}
}
