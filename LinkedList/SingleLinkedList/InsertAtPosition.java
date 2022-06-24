package singlelinkedlist;
import java.util.Scanner;
public class InsertAtPosition {
    void insertatpos(Node head,int pos)
    {
        Scanner sc=new Scanner(System.in);
        Node temp=new Node();
        Node curr=new Node();
        curr=head;
        int i=1;
        while(i<pos)
        {
        	temp=curr;
        	curr=curr.next;
        	i++;
        }
        System.out.println("Enter Element:");
        int data=sc.nextInt();
        Node n=new Node(data);
        n.next=curr;
        temp.next=n;
      
    	
    }
}
