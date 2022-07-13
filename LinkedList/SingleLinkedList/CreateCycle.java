package singlelinkedlist;
import java.util.Scanner;
public class CreateCycle {
	  void createcylce(Node head)
	 {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter positon");
		 int pos=sc.nextInt();
		 int i=1;
		 
		 Node value=new Node();
		 value=head;
		 while(i<pos)
		 {
			 value=value.next;
			 i++;
		 }
		 while(head.next!=null)
		 {
			 head=head.next;
		 }
		  head.next=value;
		  System.out.println("Cycle is Created:");
		
		 
		 
		 
		 
	 }

}
