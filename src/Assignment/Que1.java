package Assignment;
import java.util.*;
public class Que1 {
public static void main(String [] args) {
	ArrayList<String> color= new ArrayList<>();
	color.add("Blue");
	color.add("Grren");
	color.add("Red");
	//inserting element particular postion
	color.add(1,"Voilet");
	
	for(String s : color) {
		System.out.println(s);
	}
	
	color.add(0,"Purple");
	System.out.println("added at particular position");
	for(String c: color) {
		
		System.out.println(c);
	}
	
	//retrive an element from gven index
	
	System.out.println(color.get(1));
	
	//sorting
	//Collections.sort(color);
	//System.out.println(color);
	
	//sorting using bubble sort
   
	for(int i=0;i<color.size()-1;i++) {
		for(int j=0;j<color.size()-1-i;j++) {
			if(color.get(j) .compareTo( color.get(j+1))>0) {
				String temp=color.get(j);
				color.set(j, color.get(j+1));
				color.set(j+1, temp);
				
			}
		}
	}
	System.out.println(color);
	
	//reversing the element
     int left=0;
     int right=color.size()-1;
     
     while(left<right) {
    	 String temp = color.get(left);
    	 color.set(left,color.get(right));
    	 color.set(right,temp);
    	 
    	 left++;
    	 right--;
    	 
    	 
     }
     System.out.println(color);
     
     for(int i=0;i<color.size();i++) {
    	 System.out.println("Position  " + i  + " " +  color.get(i));
     }
}
}
