//Program to check for a perfect number through for loop.
//A number is called perfect if it is equal to the sum of its factors other than the number itself.
//eg: 6 = 1+2+3
package project;
import java.util.Scanner;//importing Scanner
class perfect
{   //program starts here
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); //declaring Scanner
           System.out.println("Enter the number");
           int n= in.nextInt();// Asking for the number to be checked from the user
           int sum = 0;
           for ( int i = 1; i<n;i++)//making a loop
           { if (n%i==0)
               sum=sum+i;
           }
           if (sum==n)//if else statement for printing whether it is a perfect no. or not.
           System.out.println("Perfect number");
           else
           System.out.println("Not a Perfect number");
    }//main ends here
}//program ends here