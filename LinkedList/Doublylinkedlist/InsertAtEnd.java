package doublylinkedlist;
import java.util.Scanner;
public class InsertAtEnd {
	 void  insertend(Node head )
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter element");
		 Node temp=new Node();
		 temp=head;
		 while(temp.next!=null)
		 {
			 temp=temp.next;
		 }
		 int data=sc.nextInt();
		 Node n=new Node(data);
		 n.prev=temp;
		 n.next=null;
		 temp.next=n;
		  
	 }

}
