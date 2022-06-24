package doublylinkedlist;

public class DeleteAtEnd {
	void deleteend(Node head)
	{
		Node temp=new Node();
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp=temp.prev;
		temp.next=null;
		
	}

}
