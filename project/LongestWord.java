/*Program Statement :Write a program to find the longest word in a sentence and print it along with it's length.
Sample Input: I am learning Java
Sample Output:
Longest word = learning
Length = 8
*/
package project;
import java.util.Scanner;//importing package
class LongestWord//beginning of class
 {
     public static void main (String args[])//beginning of main()
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();//inputting the sentence
          s=s.replace(".","");
          s=s +" ";//adding a space at the end, to extract the last word also
         String  word="";
         String max = "";
         int max1=0;                      
           for (int i=0;i<s.length();i++)
           {
              char ch1= s.charAt(i);//extracting characters of the string one at a time
              if (ch1 != ' ')
               word = word +ch1;//adding characters to form word if character is not space
               else if (word.length()>max1)//checking for maximum length
               {max = word;
                max1=word.length();
                word="";//emptying the temporary variable to store next word
                }  
              else
              word="";
              
        } 
             System.out.println ("Longest Word = " +max);
             System.out.println("Length = " + max1);
   }//end of main()
}//end of class
/*
                               VARIABLE DESCRIPTION TABLE
       
            NAME                         DATA TYPE                   DESCRIPTION
            s                             String                TAKES THE VALUE FROM THE USER.                
            word                          String                ACTS AS A TEMPEORARY VARIABLE.
            ch1                           char                  ADDS EVERY WORD TO VARIABLE(word).                
            maxl                          int                   CALCULATES THE LONGEST LENGTH WORD IN A STRING.                    
            max                           String                PRINTS THE LONGEST WORD IN A STRING.                                        
            
*/