package doublylinkedlist;
import java.util.Scanner;
public class InsertAtPos {
	Node insertpos(Node head,int pos)
	{
		Scanner sc=new Scanner(System.in);
		Node curr=new Node();
		curr=head;
		int i=1;
		while(i<pos)
		{
			curr=curr.next;
			i++;
		}
		System.out.println("Enter element:");
		int data=sc.nextInt();
		Node n=new Node(data);
		n.prev=curr.prev;
		n.next=curr;
		curr.prev.next=n;
		curr.prev=n;
		return head;
	}

}
