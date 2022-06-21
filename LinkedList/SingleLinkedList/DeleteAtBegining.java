package singlelinkedlist;

public class DeleteAtBegining {
          Node deleteatbegin(Node head)
          {
        	  Node start=new Node();
        	  start=head.next;
        	  head=start;
        	  
        	  return head;
          }
}
