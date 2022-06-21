package singlelinkedlist;
import java.util.Scanner;
public class Node {
        int data;
        Node next;
        Node(){}
        Node(int data)
        {
        	this.data=data;
        }
        void traverse(Node head) {
        	System.out.println("*****Elements in linked List");
        	if(head==null)
        	{
        		System.out.println("linked list is empty");
       
        	}
        	else
        	{
        		while(head!=null)
        		{
        			System.out.println(head.data);
        			head=head.next;
        		}
        	}
        }
    }

class Main{
	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter How many times you want to insert data");
	     int n=sc.nextInt();
	     int i=1;
	     Node head=new Node();
	     head=null;
	     Node temp=new Node();
	     temp=null;
	    
	     do {
	    	 System.out.println("Enter element you want to insert in linked list");
	    	 int data=sc.nextInt();
	    	 Node n1=new Node(data);
	    	 n1.next=null;
	    	 if(head==null)
	    	 {
	    		 head=temp=n1;
	    	 }
	    	 else {
	    		 temp.next=n1;
	    		 temp=n1;
	    	 }
	    	 i++;
	     }while(i<=n);
	     temp.traverse(head);
	}


}
