package doublylinkedlist;

public class DeleteAtBegining {
        Node deletebeg(Node head)
        {
        	head=head.next;
        	head.prev=null;
        	return head;
        }
}
