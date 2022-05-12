package structure;
 public class lsearch{
  public static void search(int arr[],int n,int find)
  {
	  int i;
	  for( i=0;i<n;i++)
	  {
		  if(arr[i]==find)
		  {
			  System.out.println("Element found at location"+i);
			  break;
		  }
		  
	  }
	  if(i==n)
	  {
		  System.out.println("Element not found:");
	  }
 }



	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter"+n+"Numbers:");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element you want to find:");
		int find=sc.nextInt();
		search(arr,n,find);	
	}

	
		
	}



