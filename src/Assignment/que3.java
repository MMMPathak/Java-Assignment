package Assignment;

import java.util.ArrayList;

public class que3 {
public static void main(String[] args) {
	ArrayList<Integer> i= new ArrayList<>();
	i.add(10);
	i.add(20);
	
	for(int n : i) {
		System.out.println(n);
	}
	
	int index=0;
	int index1=1;
	
     int num=i.get(index);
     int num1=i.get(index1);
     
     i.set(index, num1);
     i.set(index1, num);
     
     System.out.println(i);
     
}
}
