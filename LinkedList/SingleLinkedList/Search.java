package singlelinkedlist;

public class Search {
          int search(Node head,int find)
          {
        	  int count=1;
        	  Node start=new Node();
        	  start=head;
        	  while(start!=null)
        	  {
        		if(start.data==find)
        	    {
        	      return count;
        		}
        		 start=start.next;
        		 count++;
        		  }
        	  
        		  return 0;
        	  }
          }
	

