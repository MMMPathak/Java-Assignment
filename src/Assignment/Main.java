package Assignment;

import java.util.HashMap;

public class Main {
public static void main(String[] args) {
	HashMap<Integer,String> h= new HashMap<>();
	h.put(1, "Raj");
	h.put(2, "Dheeraj");
	h.put(3, "Ramesh");
	
	for(Integer name : h.keySet()) {
		System.out.println(h.get(name));
		
	}
	 if (h.isEmpty()) {
         System.out.println("Map is empty");
     } else {
         System.out.println("Map is not empty");
     }
	 
	 Integer keyToFind = 1; // Use Integer instead of String for key
     String value = h.get(keyToFind);
	 
	 if(value!=null) {
		 System.out.println("The value is found " + value);
	 }else {
		 System.out.println(" The value not found " + value);
	 }
	 
	 int size = h.size();
	 System.out.println(size);
	
}
}
