package doublylinkedlist;

public class DeleteAtPos {
	void  delpos(Node head,int pos)
	{
		Node curr=new Node();
		curr=head;
		int i=1;
		while(i<pos)
		{
			curr=curr.next;
			i++;
		}
		curr.next.prev=curr.prev;
		curr.prev.next=curr.next;
		
	}

}
