import java.util.Scanner;
class pattern1
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the rows number");
           int n= in.nextInt();
           for ( int i = 1; i<=n;i++)
           {
               for (int j = 1;j<=i;j++)
               {System.out.print("*"+"\t");}
               System.out.println("");
           }
 
    }
}