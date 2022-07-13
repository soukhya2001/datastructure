package singlelinkedlist;

public class DetectCycle {
	public boolean detect(Node head)
	{
		Node slow=new Node();
		Node fast=new Node();
		slow=fast=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
			{
				return true;
			}
		}
		return false;
	}

}
