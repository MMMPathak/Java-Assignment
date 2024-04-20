package Assignment;

import java.util.HashSet;

public class Main2 {
public static void main(String[] args) {
	HashSet<Integer> i= new HashSet<>();
	i.add(10);
	i.add(20);
	i.add(30);
	System.out.println("Set 1");
	for(int f : i) {
		System.out.println(f);
	}
	HashSet<Integer> i1= new HashSet<>();
	i1.add(40);
	i1.add(20);
	i1.add(30);
	System.out.println("set 2");
	
	for(int g: i1) {
		System.out.println(g);
	}
	
	
	i.retainAll(i1);
	System.out.println(i);
	
	
	
}
}
