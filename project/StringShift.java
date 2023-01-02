/*Program Statement : Write a Java program to accept a String in uppercase and shift each letter of the alphabet towards one right.
 * Eg.A becomes B,B becomes C and Z becomes A and so on.
 * Characters other than letter remain same.
 * Sample Input: ZIA IS LIVING IN DELHI
 * Sample Output: AJB JT MJWJOH JO EFMIJ
 */
package project;
import java.util.Scanner;//importing Scanner class from util package.
class StringShift
 {//class begins here
     public static void main (String args[])
       {//main begins here
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a string.");
          String s=in.nextLine();//inputting String from the user
          s=s +" ";//Adding space to the last word so as to make it a word.
          int asc1;
          s=s.replace(".","");
           for (int i=0,n1=0;i<s.length();i++)//for loop
        {   char ch= s.charAt(i);//extracting letter at index i of the String s.
            if (ch != ' ')//separating words
              {  asc1=(int)ch;
                  if(asc1!=90){//if ch is not Z,it will print the next letter of alphabetical order. 
                  asc1+=1;//adding 1 to the ascii value of the letter
                  ch=(char)asc1;//converting int to char
                  System.out.print(ch);
                }else//if ch is 'Z' the it will print 'A'
               {ch='A';
                System.out.print(ch);
                  }
                } 
            else System.out.print(" ");//separating words when a space occurs...
        } //for ends here
    }//main ends here
}//class ends here
/*                                  VARIABLE DESCRIPTION TABLE
 *          NAME                             DATA TYPE                            DESCRIPTION
 *          s                                 String                    For inputting String from the user.
 *          asc                                int                      to get the ascii value of ch.
 *          ch                                char                      for extracting letters from the string at index i.
 *          i                                  int                      act as a counter variable for for loop.
 */    