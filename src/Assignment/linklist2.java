package Assignment;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class linklist2 {
	 Node head;
	
	public  void addlast(int data) {
		Node newnode= new Node(data);
		if(head==null) {
			head=newnode;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	
	public  boolean isequal(linklist2 otherlist) {
		Node li= this.head;
		Node l2=otherlist.head;
		
		while(li!=null && l2!=null) {
			if(li.data!=l2.data) {
				return false;
			}
			li=li.next;
			l2=l2.next;
			
		}
		return li==null && l2==null;
	}
	public  void display() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
public static void main(String[] args) {
	linklist2 l1 = new linklist2();
	linklist2 l2= new linklist2();
	
	 l1.addlast(10);
     l1.addlast(20);
     l1.addlast(30);
     
     l2.addlast(10);
     l2.addlast(20);
     l2.addlast(30);
     
     boolean result=l1.isequal(l2);
     
     if(result) {
    	 System.out.println("List are equal");
     }else {
    	 System.out.println("List are not equal");
     }
     
	
}
}
