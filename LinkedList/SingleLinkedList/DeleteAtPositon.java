package singlelinkedlist;
public class DeleteAtPositon {
   void deleteatpos(Node head,int pos)
   { 

	   Node start=new Node();
	   start=head;
	   Node temp=new Node();
	   int i=1;
	   while(i<pos)
	   {
		   temp=start;
		   start=start.next;
		   i++;
	   }
	   temp.next=start.next; 
	 
   }
}
