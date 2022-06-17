package arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void reverse(int arr[])
	{
		 int j;
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[0];
			for(j=0;j<arr.length-i-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
	}
   public static void main(String[] args)
   {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Length of array:");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.println("Enter "+n+ "numbers");
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	   reverse(arr);
	   for(int x:arr)
	   {
		   System.out.println(x);
	   }
   }
}
