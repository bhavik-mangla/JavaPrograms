//Program Statement: Write a program to print a character in a rows and column pattern through overloading function.
package project;
import java.util.Scanner;//importing Scanner
public class CharacterPATTERN
 {   //program starts here
    int x,y; 
    char h;
    void design(int x,char h)//1st function
    { 
        for ( int i = 1; i<=x; i++ )//making nested loops
           {
               for (int j =1 ;j<=x;j++)
               {
                   System.out.print(h+"\t");//printing the required pattern
                }
               System.out.println("");
            } 
        } //function1 ends here
    void design(int x,int y)//overloaded 1st function
    { Scanner in = new Scanner (System.in);//declaring Scanner
        System.out.println("Enter the character to be printed:-");
        h = in.nextLine().charAt(0);
      for ( int i = 1; i<=x; i++ )
           { 
               for (int j =1 ;j<=y;j++)//nested loops
               {
                   System.out.print(h+"\t");//printing the required pattern
                }
               System.out.println("");
            } 
        }////function2 ends here
}//program ends here
//program ends
/*                   VARIABLE DESCRIPTION TABLE
 *    
 *    NAME                  DATA TYPE                             DESCRIPTION
 *    x                        int                   INPUTTING THE NO. OF ROWS FOR THE PATTERN.                      
 *    y                        int                   INPUTTING THE NO. OF COLUMN FOR THE PATTERN.                       
 *    h                        char                  INPUTTING THE CHARACTER FOR THE PATTERN.
 *    i                        int                   COUNTER VARIABLE USED FOR PRINTING THE REQUIRED PATTERN.
 *    j                        int                   COUNTER VARIABLE USED FOR PRINTING THE REQUIRED PATTERN. 
 */
