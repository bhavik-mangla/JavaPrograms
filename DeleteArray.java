import java.util.*;
public class DeleteArray

{ 
    public static void main(String args []){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = scan.nextInt();
        Integer arr[]= new Integer[n];
        System.out.println("Enter values for array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter number of elements you want to delte");
       int s = scan.nextInt();
       Integer del[] = new Integer[s];
       System.out.println("Enter values for elements you want to delete");
       for(int i=0;i<s;i++)
       {
           del[i]=scan.nextInt();
        }
      for(int i=0;i<s;i++)
      {
          for(int j=0;j<n;j++)
          {
              if(del[i]==arr[j])
              arr[j]=null;
              
            }
        }
        System.out.println("The new array is");
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=null)
            {
                System.out.print(arr[i]+" ");
            }
        }
}
}
