//Program to print a triangle of stars (*) through nested loop.
package project;
import java.util.Scanner;//importing Scanner
class triangleOFstar
{   //program starts here
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); //declaring Scanner
           System.out.println("Enter the rows number");
           int n= in.nextInt();//// Asking for the rows number from the user.
           for ( int i = 1; i<=n;i++)//1st loop
           {
               for (int j = 1;j<=i;j++)//2nd nested loop
               {
                   System.out.print("*"+" ");
                }
               System.out.println("");
           }
    }        //main ends here
}        //program ends here
/*
                               VARIABLE DESCRIPTION TABLE
       
            NAME                         DATA TYPE                   DESCRIPTION
            n                             int                   TAKES THE ROWS NO. FROM THE USER.                
            i                             int                   COUNTER VARIABLE FOR PRINTING STARS IN A PATTERN.
            j                             int                   COUNTER VARIABLE FOR PRINTING STARS IN A PATTERN.
*/