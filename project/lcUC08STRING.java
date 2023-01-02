/*Write a Java program to accept a string and print the number of lower case characters, the number of uppercase characters and the number of digits in the String. 
 * Sample input: Common Wealth Games 2010
 * Output :
 * Uppercase characters = 3 
 * Lowercase characters = 14 
 * Digits = 4 
 */
package project;
import java.util.Scanner;//Importing scanner class from util package
class lcUC08STRING
 { //Class begins here 
     public static void main (String args[])
       {//Main starts here 
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a string.");
          String s=in.nextLine();//Inputting string from the user 
          int count1=0,count2=0,count3=0,count4=0,count5=0;
          int asc=0;//Initialising and declaring ch
           for (int i=0;i<s.length();i++)//for begins here 
        {     char ch1= s.charAt(i);////extracting letter at index i of the String s.
            asc=(int)ch1;//converting ch into it's ascii value
              if (asc >=65 && asc<=90 )//checking for uppercase letters
              {  count1+=1;//and increasing counter value by 1 if ch is an uppercase letter 
                }
                else if (asc>=97 && asc<=122)//checking for lowercase letters
               {count2+=1;
                  }
                else if (asc>=48 && asc<=57)//checking for digits 0-9
                {count3+=1;
                }
                
             else if(ch1==' ')//checking for spaces
             {count4+=1;
            }  
            else ////checking for special characters
            count5+=1;
        }
        System.out.println("Uppercase Characters = "+ count1);//printing the counter value for all types of characters...
        System.out.println("Lowercase Characters = "+ count2);
        System.out.println("Digits = "+ count3);
        System.out.println("Number of spaces = "+ count4);
        System.out.println("Special Characters = "+ count5);
    }//main ends here
}//class ends here
/*                                  VARIABLE DESCRIPTION TABLE
 *          NAME                             DATA TYPE                            DESCRIPTION
 *          s                                 String                    For inputting String from the user.
 *          asc                                int                      to get the ascii value of ch.
 *          ch                                char                      for extracting letters from the string at index i.
 *          i                                  int                      act as a counter variable for for loop.
 *          count1                             int                      to count the number of uppercase letters.
 *          count2                             int                      to count the number of lowercase letters.
 *          count3                             int                      to count the number of digits.
 *          count4                             int                      to count the number of spaces.
 *          count5                             int                      to count the number of special characters.
 */    