//Program to check for a prime number through for loop.
package project;
import java.util.Scanner; //importing Scanner
class prime
{   //program starts here
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); //declaring Scanner
           System.out.println("Enter the number");
           int n= in.nextInt();//Asking for the no. to be checked from the user.
           boolean flag=true;
           for ( int i = 2; i<n;i++)//making a loop
           { 
               if (n%i==0)
               flag=false;
           }
           if (flag==true)//if..else to print whether the number is prime or not.
           System.out.println("Prime number");
           else
           System.out.println("Not a Prime number");
    }        //main ends here
}//program ends here