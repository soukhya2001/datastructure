
class bubblesort {
    public static void main(String[] args) {
       java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.println("Enter size of array:");
       int n=sc.nextInt();
       int []arr=new int[n];
       System.out.println("Enter"+n+"Numbers:");
       System.out.println();
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
           
       }
       System.out.println("*******Elements befor Bubble Sort*******");
       System.out.println();
       for(int i=0;i<n;i++)
       {
           System.out.println(arr[i]);
       }
       for(int i=0;i<n;i++)
       {
           
           for(int j=1;j<n-i;j++)
           {
               if(arr[j]<arr[j-1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
           }
       }
    }
    System.out.println("*****Elements after Bubble sort:**********");
    System.out.println();
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]);
    }
}
}