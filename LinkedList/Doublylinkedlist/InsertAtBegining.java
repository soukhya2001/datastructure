package doublylinkedlist;

import java.util.Scanner;

public class InsertAtBegining {
    Node insert(Node start)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter element you want to insert At begining ");
    	int data=sc.nextInt();
    	Node n=new Node(data);
    	n.prev=null;
    	n.next=start;
    	start.prev=n;
    	start=n;
    	return start;
    }
	

}
