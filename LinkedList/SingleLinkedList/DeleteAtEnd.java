package singlelinkedlist;

public class DeleteAtEnd {
	Node deleteatend(Node head,Node temp)
	{
		Node start=new Node();
		start=head;
		Node tt=new Node();
		tt=null;
		while(start.next!=null)
		{
			tt=start;
			start=start.next;
			
		}
		tt.next=null;
		temp=tt;
		
		return temp;
	}

}
