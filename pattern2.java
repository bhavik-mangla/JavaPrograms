import java.util.Scanner;
class pattern2
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the rows number");
           int rn= in.nextInt();
           for ( int i = 1; i<=rn;i++)
           {
               for (int j = 1;j<=i;j++)
               {
                   if(j%2==0)System.out.print("#"+" ");
                   else System.out.print("*"+" ");
                }
                System.out.println();
           }
          
       
    }
}