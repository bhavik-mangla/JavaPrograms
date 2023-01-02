import java.util.Scanner;
class Q5_2017
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the rows number");
           int n= in.nextInt();int k=1;
           for ( int i = 1; i<=n;i++)
           {
               for (int j = 1;j<=i;j++,k++)
               {System.out.print(k+"\t");}
               System.out.println("");
           }
 
    }
}