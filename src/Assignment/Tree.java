package Assignment;

import java.util.TreeSet;

public class Tree {
public static void main(String[] args) {
	TreeSet <String> s= new TreeSet<>();
	s.add("Green");
	s.add("Red");
	s.add("Purple");
	
	for(String v : s) {
		System.out.println(v);
	}
	
	TreeSet<Integer> i= new TreeSet<>();
	i.add(10);
	i.add(5);
	i.add(6);
	i.add(11);
	
	 TreeSet<Integer> Tree = new TreeSet<>(i.headSet(7));
	 System.out.println("Number less then 7");
	 System.out.println(Tree);
}
}
