package singlelinkedlist;

public class RemoveCycle {
	 void removecycle(Node head)
	 {
		 Node slow=new Node();
		 Node fast=new Node();
		 slow=fast=head;
		 do {
			 slow=slow.next;
			 fast=fast.next.next;
		 }while(slow!=fast);
		 slow=head;
		 while(slow.next!=fast.next)
		 {
			 slow=slow.next;
			 fast=fast.next;
		 }
		 fast.next=null;
		 System.out.println("Cycle Removed:");
		 
	 }

}
