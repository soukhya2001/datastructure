package doublylinkedlist;

public class DeleteAtEnd {
	Node deleteend(Node temp )
	{
		temp=temp.prev;
		temp.next=null;
		return temp;
	}

}
