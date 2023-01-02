/* *Program Statement : To check whether a number is Armstrong or not.
 * * Example : 153 is an Armstrong number as (1^3)+(5^3)+(3^3)=153. */
// BEGINNING OF PROGRAM
package project;
import java.util.Scanner;//importing package java.util.Scanner
public class Armstrong{//beginning of class
    public static void main(String[] args) {//beginning of main()
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");                
        int input = in.nextInt();                                              //TAKING THE VALUE FROM THE  USER
        String inputAsString = input + "";
        int numberOfDigits = inputAsString.length();                                //COUNTING THE NUMBER OF DIGITS
        int copyOfInput = input;                                                                  
        int sum = 0;
        while (copyOfInput != 0) {                                                                           
            int lastDigit = copyOfInput % 10;                                       //FACTORIAL
            sum = sum + (int) Math.pow(lastDigit, numberOfDigits);                           
            copyOfInput = copyOfInput / 10;   }
        if (sum==input) {
            System.out.println( input+" is an armstrong number");  }
        else{
            System.out.println(input+" is not an armstrong number");   }
    }//end of main()
}//end of class  
//PROGRAM ENDS HERE

/*                                  VARIABLE DESCRIPTION TABLE
 *          NAME                             DATA TYPE                            DESCRIPTION
 *          input                              int                      For taking the value from the user.
 *          inputAsString                     String                    Helps  to use sting handling
 *          numberOfDigits                     int                      For counting the number of digits.
 *          copyOfInput                        int                      For deleting each  digit from the last.                   
 *          lastDigit                          int                      For storing the value of last digit.          
 */
