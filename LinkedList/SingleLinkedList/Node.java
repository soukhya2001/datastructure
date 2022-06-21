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
	     System.out.println("Enter position Where you want to insert the element:");
	     int pos=sc.nextInt();
	     if(pos>n || pos<1)
	     {
	    	 System.out.println("Invalid Position:");
	     }
	     if(pos==1)
	     {
	     InsertAtBegining obj=new InsertAtBegining();
		 head=obj.insert(head);
		 
		 temp.traverse(head);
		 n++;
	     }
	     else if(pos==n)
	     {
	     InsertAtEnd obj2=new InsertAtEnd();
		temp= obj2.insertend(temp);
		temp.traverse(head);
		n++;
	     }
	     
	     else
	     {
	    	 InsertAtPosition obj3=new InsertAtPosition();
	    	 head=obj3.insertatpos(head, pos);
	    	 temp.traverse(head);
	    	 n++;
	     }
	     System.out.println("Enter position form where you want to delete");
	     int delpos=sc.nextInt();
	     if(delpos>n || delpos<1)
	     {
	    	 System.out.println("Invalid Position:");
	     }
	     else if(delpos==1)
	     {
	     DeleteAtBegining obj4=new DeleteAtBegining();
	      head=obj4.deleteatbegin(head);
	      temp.traverse(head);
	      n--;
	      }
	     if(delpos==n)
	     {
	    	 DeleteAtEnd obj5=new DeleteAtEnd();
	    	 temp=obj5.deleteatend(head, temp);
	    	  temp.traverse(head);
	    	  n--;
	     }
	     else
	     {
	    	 DeleteAtPositon obj6=new DeleteAtPositon();
	    	head= obj6.deleteatpos(head, delpos);
	    	temp.traverse(head);
	    	n--;
	    	 
	     }
	     System.out.println("Enter element you want to search");
	     int find=sc.nextInt();
	     Search obj7=new Search();
	      int n1=obj7.search(head, find);
	      if(n1==0)
	      {
	    	  System.out.println("Element not found");
	      }
	      else
	      {
	    	  System.out.println("Element found at Location="+n1);
	      }
	      
	     
	     
	}


}
