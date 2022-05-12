package structure;

public class bsearch {
	public static int binary(int arr[],int n,int find)
	{
		 int first=0;
		 int last=n-1;
		
		 while(first<=last)
		 {
			 int mid=(first+last)/2;
			 if(arr[mid]==find)
			 {
				 return mid;
			 }
			 else if(arr[mid]<find)
			 {
				 first=mid+1;
			 }
			 else
			 {
				 last=mid-1;
			 }

		 }
		 
	return -1;
		
		
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter "+ n+" Numbers:");
		System.out.println();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to find:");
		int find=sc.nextInt();
		int res= binary(arr,n,find);
		if(res==-1)
		{
			System.out.println("Element not found:");
		}
		else
		{
			System.out.println("Element found at location:"+res);
		}
		
		}

}
