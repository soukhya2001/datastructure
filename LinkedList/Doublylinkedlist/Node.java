package doublylinkedlist;
import java.util.Scanner;
public class Node {
	int data;
	Node prev;
	Node next;
	Node(){}
	Node(int data)
	{
		this.data=data;
		
	}
	void traverse(Node head)
	{
		System.out.println("Elements in Linked List:");
		Node curr=head;
		if(curr==null)
		{
			System.out.println("Linked list is Empty:");
		}
		else {
		while(curr!=null)
		{
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	}
}
class Main{
	public static Node element(int n)
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		Node head=null;
		Node temp=null;
	
		do {
			
			System.out.println("Enter Element");
			int data=sc.nextInt();
			Node obj=new Node(data);
			obj.next=null;
			obj.prev=null;
			if(head==null)
			{
				head=temp=obj;
			}
			else
			{
			  obj.prev=temp;
			  temp.next=obj;
			  temp=obj;
				
			}
			i++;
				
		   }while(i<=n);
		
		   return head;
	       }
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many elements you want to enter");
		int n=sc.nextInt();
		
		Node head=new Node();
	    head=element(n);
		int one = 0;
		do
		{
		System.out.println("------------");
		System.out.println("Enter 1 to insert at Begining");
		System.out.println("Enter 2to insert at End");
		System.out.println("Enter 3 to insert at Specific position:");
		System.out.println("Enter 4 to Delete at Begining");
		System.out.println("Enter 5 to Delete at End");
		System.out.println("Enter 6 to Delete at specific positon:");
		System.out.println("Enter 7 to Reverse Linked list:");
		System.out.println("Enter 0 to Exit:");
		System.out.println("------------");
		System.out.println("Enter Your Choice:");
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
			InsertAtEnd obj=new InsertAtEnd();
			obj.insertend(head);
			head.traverse(head);
			n++;
			break;
			
		}
		
		case 3:
		{
			System.out.println("Enter position");
			int pos=sc.nextInt();
			if(pos>n ||pos<1)
			{
				System.out.println("Invalid Position:");
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
				InsertAtPos obj=new InsertAtPos();
				obj.insertpos(head, pos);
				head.traverse(head);
				n++;
			}
			break;
		}
		
		case 4:
		{
			DeleteAtBegining obj=new DeleteAtBegining();
			head=obj.deletebeg(head);
			n--;
			head.traverse(head);
			break;
		}
		
		case 5:
		{
			DeleteAtEnd obj=new DeleteAtEnd();
			obj.deleteend(head);
			n--;
			head.traverse(head);
			break;
		}
		case 6:
		{
			System.out.println("Enter postion:");
			int pos=sc.nextInt();
			if(pos>n ||pos<1)
			{
				System.out.println("Invalid position:");
			}
			else if(pos==1)
			{
				DeleteAtEnd obj=new DeleteAtEnd();
				obj.deleteend(head);
				n--;
				head.traverse(head);
            }
			else if(pos==n)
			{
				DeleteAtEnd obj=new DeleteAtEnd();
				obj.deleteend(head);
				n--;
				head.traverse(head);
			}
			else
			{
				DeleteAtPos obj=new DeleteAtPos();
				obj.delpos(head, pos);
				n--;
				head.traverse(head);
            }
			break;
		}
		
		case 0:
		{
			break;
		}
		case 7:
		{

			Reverse obj=new Reverse();
			head=obj.reverse(head);
			head.traverse(head);
			break;
		}
		default:
		{
			System.out.println("Invalid Input:");
		}
		}
		System.out.println("Enter 1 to continue...");
		 one=sc.nextInt();
		}
		while(one==1);

    }	
	}




