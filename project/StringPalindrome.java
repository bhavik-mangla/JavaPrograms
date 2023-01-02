/*Program Statement :Check if a string is a palindrome or not. */
//A string is a palindrome if it remains unchanged when reversed
//For eg: "dad" is a palindrome as reverse of "dad" is "dad" 
//Whereas "program" isn't a palindrome as its reverse is “margorp”.
package project;
import java.util.Scanner;
class StringPalindrome
 {   //class begins here
     public static void main(String args[])
      {//main starts here
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the word");
          String s=in.nextLine();//inputting a word from user.
          StringBuffer sb = new StringBuffer(s);//creating a StringBuffer object.
          sb=sb.reverse();//reversing the String using StringBuffer reverse function. 
          String s1=sb.toString();//converting StringBuffer to String
          if(s.equals(s1))//checking for palindrome
          {System.out.println("It's a palindrome");
            }
            else System.out.println("It's not a palindrome");
        }//main ends here
    }//class ends here
//program ends
/*                   VARIABLE DESCRIPTION TABLE
 *    
 *    NAME                  DATA TYPE                             DESCRIPTION
 *    s                       String                 FOR INPUTTING STRING FROM USER AND CHECK FOR PALINDROME.                      
 *    sb                    StringBuffer             FOR USING StringBuffer FUNCTION reverse().                       
 *    s1                      String                 FOR CONVERTING String to StringBuffer AND USING equals() FUNCTION OF String.
 */

