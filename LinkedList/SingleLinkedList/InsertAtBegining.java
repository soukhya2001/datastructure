package singlelinkedlist;

import java.util.Scanner;


 public class InsertAtBegining {
        Node insert(Node start)
        {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter element you want to insert At begining ");
        	int data=sc.nextInt();
        	Node n=new Node(data);
        	n.next=start;
        	start=n;
        	return start;
        }
	
}


