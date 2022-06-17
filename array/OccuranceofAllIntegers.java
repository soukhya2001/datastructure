package arrays;
import java.util.Scanner;
public class OccuranceofAllIntegers {
	public static void Occurance(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			if(arr[i]!=-1)
			{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
					arr[j]=-1;
				}
			}
			System.out.println(arr[i]+"ocuured"+count+"times");
			
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter"+n+" positive numbers:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Occurance(arr);
	}

}
