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
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many elements you want to enter");
		int n=sc.nextInt();
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
		System.out.println("Enter positon where you want to insert:");
		int pos=sc.nextInt();
		if(pos>n ||pos<1)
		{
			System.out.println("Invalid position:");
			
		}
		else if(pos==1)
		{
		InsertAtBegining obj=new InsertAtBegining();
		head=obj.insert(head);
		temp.traverse(head);
		n++;
		}
		else if(pos==n)
		{
			InsertAtEnd obj=new InsertAtEnd();
			temp=obj.insertend(temp);
			n++;
			temp.traverse(head);
		}
		else {
			InsertAtPos obj=new InsertAtPos();
			head=obj.insertpos(head, pos);
			temp.traverse(head);
               
		     }
		System.out.println("Enter pos from where you want to delete:");
		int del=sc.nextInt();
		if(del>n ||del<1)
		{
			System.out.println("Invalid Position:");
		}
		else if(del==1)
		{
		DeleteAtBegining obj=new DeleteAtBegining();
		head=obj.deletebeg(head);
		n--;
		temp.traverse(head);
		}
		else if(del==n)
		{
			DeleteAtEnd obj=new DeleteAtEnd();
			temp=obj.deleteend(temp);
			n--;
			temp.traverse(head);
		}
		else {
			DeleteAtPos obj=new DeleteAtPos();
			head=obj.delpos(head, del);
			n--;
			temp.traverse(head);
			
		}
		Traversereverse obj=new Traversereverse();
		obj.treverse(temp);
		
		
	}
}
