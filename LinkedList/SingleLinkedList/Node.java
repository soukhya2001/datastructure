package singlelinkedlist;
import java.util.Scanner;

import doublylinkedlist.DeleteAtPos;
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
	public static Node element(int n)
	{
	    Scanner sc=new Scanner(System.in);
	     int i=1;
	     Node head=new Node();
	     head=null;
	     Node temp=new Node();
	     temp=null;
	    
	     do {
	    	 System.out.println("Enter element");
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
	     return head;
	}
	public static void main(String[] args)
	{
		int one=0;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter How many times you want to insert data");
	     int n=sc.nextInt();
	     Node head=new Node();
	     head= element(n);
	     do {
	     System.out.println("------------");
	     System.out.println("Enter 1 to insert at Begining");
	     System.out.println("Enter 2 to insert at End");
	     System.out.println("Enter 3 to insert at position:");
	     System.out.println("Enter 4 to Delete at Begining");
	     System.out.println("Enter 5 to Delete at End");
	     System.out.println("Enter 6 to Delete at Position:");
	     System.out.println("Enter 0to Exit:");
	     System.out.println("---------------");
	     System.out.println("Enter your choice");
	     int choice=sc.nextInt();
	     switch(choice)
	     {
	     case 1:
	     {
	         InsertAtBegining obj=new InsertAtBegining();
			 head=obj.insert(head);
			 head.traverse(head);
			 n++;
			 break;
	     }
	     case 2:
	     {
	    	InsertAtEnd obj2=new InsertAtEnd();
	 		obj2.insertend(head);
	 		head.traverse(head);
	 		n++;
	 		break;
	     }
	     case 3:
	     {
	    	 System.out.println("Enter position:");
	    	 int pos=sc.nextInt();
	    	 if(pos>n ||pos<1)
	    	 {
	    		 System.out.println("invalid position:");
	    	 }
	    	 else if(pos==1)
	    	 {
	    		 InsertAtBegining obj=new InsertAtBegining();
				 head=obj.insert(head);
				 head.traverse(head);
				 n++;	 
	    	 }
	    	 else if(pos==n)
	    	 {
	    			InsertAtEnd obj=new InsertAtEnd();
	    	 		obj.insertend(head);
	    	 		head.traverse(head);
	    	 		n++;
	    	 }
	    	 else
	    	 {
	    		 InsertAtPosition obj=new InsertAtPosition();
	    		 obj.insertatpos(head, pos);
	    		 head.traverse(head);
	    		 n++;
	    	 }
	    	 break;
	     }
	     case 4:
	     {
	    	 DeleteAtBegining obj=new DeleteAtBegining();
	    	 head=obj.deleteatbegin(head);
	    	 head.traverse(head);
	    	 n++;
	    	 break;
	     }
	     case 5:
	     {
	    	 DeleteAtEnd obj=new DeleteAtEnd();
	    	 obj.deleteatend(head);
	    	 n--;
	    	 head.traverse(head);
	    	 break;
	     }
	     case 6:
	     {
	    	 System.out.println("Enter position:");
	    	 int pos=sc.nextInt();
	    	 if(pos>n ||pos<1)
	    	 {
	    		 System.out.println("invalid Position:");
	    	 }
	    	 else if(pos==1)
	    	 {
	    		 DeleteAtBegining obj=new DeleteAtBegining();
		    	 head=obj.deleteatbegin(head);
		    	 head.traverse(head);
		    	 n++;
	    	 }
	    	 else if(pos==n)
	    	 {
	    		 DeleteAtEnd obj=new DeleteAtEnd();
		    	 obj.deleteatend(head);
		    	 n--;
		    	 head.traverse(head); 
	
	    	 }
	    	 else
	    	 {
	    		 DeleteAtPositon obj=new DeleteAtPositon();
	    		 obj.deleteatpos(head, pos);
	    		 head.traverse(head);
	    		 n--;
	    		 
	    	 }
	    	 break;
	     }
	     case 0:
	     {
	    	 break;
	     }
	    
	     default:
	     {
	    	 System.out.println("Invalid input:");
	     }
	     }
	     System.out.println("Enter 1 to continue...");
	     one=sc.nextInt();
	     }while(one==1); 
	     
	     
	}
}
