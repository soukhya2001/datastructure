package arrays;
import java.util.Scanner;

public class FindMinandMaxElement {
	public static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		return max;	
	}
	public static int min(int []arr)
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+ "Numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=max(arr);
		int min=min(arr);
		System.out.println("Maximum value="+max);
		System.out.println("Minimum value="+min);
	}

}
