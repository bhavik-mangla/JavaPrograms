import java.util.*;
public class duplicatearray

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
        
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
              if(arr[i]==arr[j])
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
