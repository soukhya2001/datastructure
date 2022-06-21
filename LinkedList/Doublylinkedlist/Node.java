package doublylinkedlist;
import java.util.Scanner;
public class Node {
	int data;
	Node prev;
	Node next;
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
		temp.traverse(head);
	}
}
