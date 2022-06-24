package singlelinkedlist;

public class DeleteAtEnd {
	void deleteatend(Node head)
	{
		Node start=new Node();
		start=head;
		Node temp=new Node();
		while(start.next!=null)
		{
			temp=start;
			start=start.next;
		}
		temp.next=null;	
	}

}
