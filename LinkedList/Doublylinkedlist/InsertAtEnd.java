package doublylinkedlist;
import java.util.Scanner;
public class InsertAtEnd {
	 Node insertend(Node temp)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the element you want to insert at last");
		 int data=sc.nextInt();
		 Node n=new Node(data);
		 n.prev=temp;
		 n.next=null;
		 temp.next=n;
		 temp=n;
		 return temp; 
	 }

}
