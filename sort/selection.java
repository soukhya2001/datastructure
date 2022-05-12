class selection{
    public static void main(String[] args) {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter size of array:");
     int n=sc.nextInt();
     int []arr=new int[n];
     System.out.println("Enter "+n+" Numbers:");
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     System.out.println("*****Elements before Selection Sort******");
     System.out.println();
     for(int i=0;i<n;i++)
     {
         System.out.println(arr[i]);
     }
     for(int i=0;i<n;i++)
     {
          int temp=arr[i];
         for(int j=i;j<n;j++)
         {
             if(arr[j]<temp)
             {
                 int t=arr[j];
                 arr[j]=temp;
                 temp=t;
             }
         }
         int t=arr[i];
         arr[i]=temp;
         temp=t;
     }
     System.out.println("***Elements After Selection Sort*****");
     System.out.println();
     for(int i=0;i<n;i++)
     {
         System.out.println(arr[i]);
     }
    }
}