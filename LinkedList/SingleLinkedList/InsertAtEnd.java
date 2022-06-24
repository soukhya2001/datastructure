package singlelinkedlist;
import java.util.Scanner;
public class InsertAtEnd {
      void insertend(Node head)
     {
    	  Node temp=new Node();
    	  temp=head;
    	  while(temp.next!=null)
    	  {
    		  temp=temp.next;
    	  }
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter element");
    	 int data=sc.nextInt();
    	 Node n=new Node(data);
    	 n.next=null;
    	 temp.next=n;
    	
    	 
     }
}
