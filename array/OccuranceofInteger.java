package arrays;
import java.util.Scanner;

public class OccuranceofInteger {
	public static int occurance(int[]arr,int occ)
	{
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==occ)
	    	{
	    		count++;
	    	}
	    }
	    return count;
		
		
	}
   public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Length of array:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter"+n+"Numbers:");
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();	
       }
       System.out.println("Enter the number you want to find occurance of:");
       int num=sc.nextInt();
       int occurance=occurance(arr,num);
       System.out.println(num+"Occured "+occurance+" times");
       
}
}
