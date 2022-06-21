package singlelinkedlist;
import java.util.Scanner;
public class InsertAtEnd {
     Node insertend(Node temp)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Element you want to insert At end:");
    	 int data=sc.nextInt();
    	 Node n=new Node(data);
    	 n.next=null;
    	 temp.next=n;
    	 temp=n;
    	 return temp;
     }
}
