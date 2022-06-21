package singlelinkedlist;
import java.util.Scanner;
public class InsertAtPosition {
    Node insertatpos(Node head,int pos)
    {
    	Scanner sc=new Scanner(System.in);
        Node temp=new Node();
        temp=null;
        Node curr=new Node();
        curr=head;
        int i=1;
        while(i<pos)
        {
        	temp=curr;
        	curr=head.next;
        	i++;
        }
        System.out.println("Enter Element:");
        int data=sc.nextInt();
        Node n=new Node(data);
        n.next=curr;
        temp.next=n;
        return head;
    	
    }
}
