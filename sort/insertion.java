package sort;

	public class insertion {
	    
	    void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int temp = arr[i];
	            int j = i - 1;
	 
	            while (j >= 0 && arr[j] > temp) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = temp;
	        }
	    }
	 
	   
	 
	 
	   
	    public static void main(String args[])
	    {
	        int arr[] = { 4, 1, 3, 5, 2 };
	 
	        insertion ob = new insertion();
	        ob.sort(arr);
	        int n=arr.length;
	 
	         for(int i=0;i<n;i++)
	         {
	        	 System.out.print(arr[i]+" ");
	         }
	    }
	}



