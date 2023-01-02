package project;
/*Program Staement:
 * Write a Program in Java to input a number and check whether it is an Automorphic Number or not.
 * Note: An automorphic number is a number which is present in the last digit(s) of its square.
 * Example: 25 is an automorphic number as its square is 625 and 25 is present as the last digits
 */
import java.io.*;// importing package java.io.*
class Automorphic//beginning of class
{
  public static void main(String args[]) throws IOException//beginning of main()
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter a Number : "); // Inputting the number
 
    int n = Integer.parseInt(br.readLine());
    int sq = n*n; // Finding the square
    int c = 0, copy = n;
     
    // While loop for counting the number of digits in the number
    while(copy > 0)
    {
        c++;
        copy = copy/10;
    }//end of while
     
    /* Finding the end digits of the square. 
     * If the number has 2 digits, then we need to find last 2 digits of square 
     * i.e. do a 'sq % 100' operation
     */
    int end = sq % (int)Math.pow(10,c);
     
    if(n == end) // If the square ends with the number then it is Automorphic
        System.out.print(n+" is an Automorphic Number.");
    else
        System.out.print(n+" is not an Automorphic Number.");
    }//end of main().
}//end of class
/*                                            VARIABLE DESCRIPTION TABLE
                                      
 *      Variable Name                          Data type                               Decription
 *      n                                       int                            To store the number.
 *      sq                                      int                            To store the square of the number.
 *      c                                       int                            counter variable for increment.
 *      copy                                    int                            A copy of n(number ).
 *      end                                     int                            to store the end result to compare with number.
*/