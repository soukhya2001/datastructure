package doublylinkedlist;

public class Reverse {
    Node reverse(Node head)
    {
    	Node curr=new Node();
    	Node nxt=new Node();
    	Node pre=new Node();
    	curr=head;
    	while(curr!=null)
    	{
    		pre=curr;
    		nxt=curr.next;
    		curr.next=curr.prev;
    		curr.prev=nxt;
    		curr=nxt;
    	}
    	head=pre;
    	return head;
    }
}
