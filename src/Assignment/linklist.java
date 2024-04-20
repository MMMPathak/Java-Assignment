package Assignment;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class linklist {
	static Node head;
	
public static void addbeg(int data) {	
	Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;
		
		
	}
public static void pos(int data,int pos) {
	Node newnode = new Node(data);
	if(pos<0) {
		System.out.println("Invalid");
	}
	if(pos==0) {
		newnode.next=head;
		head=newnode;
		return;
	}
	Node temp=head;
  for(int i=0;temp!=null && i<pos-1;i++) {
	  temp=temp.next;
  }
  if(temp==null) {
	  System.out.println("Invalid");
  }
  newnode.next=temp.next;
  temp.next=newnode;
  
}

public static void addlast(int data) {
	Node newnode = new Node(data);
	if(head==null) {
		head=newnode;
		return;
	}
	Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}

	temp.next=newnode;
	
	
}
public static boolean replace(int oldval,int newval) {
	Node temp=head;
	while(temp!=null) {
		if(temp.data==oldval) {
			temp.data=newval;
			return true;
		}
		temp=temp.next;
			
	}
	return false;
}

public static boolean check(int target) {
	Node temp=head;

	while(temp!=null) {
		if (temp.data==target) {
			return true;
		}
		temp=temp.next;
	}
	return false;
}
public static void display() {
	int position=0;
	Node current=head;
	while(current!=null) {
		System.out.println("Position " +  position  + " " +   current.data);
		current=current.next;
		position++;
	}
}
public static void main(String[] args) {
	linklist l = new linklist();
     addbeg(10);
	addlast(20);
	pos(40, 1);
	
	display();
	boolean exist=check(40);
	System.out.println("The element prsent " + exist);
	boolean val=replace(20, 30);
	System.out.println("The valus replaced " + val);
	
	display();
}
}
