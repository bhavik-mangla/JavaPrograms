import java.util.Scanner;
import java.lang.*;
class reverseString
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          s=s +" ";s=s.replace(".","");
         String s1="", word="";
         String max = "";
         int max1=0;     
         
           for (int i=0;i<s.length();i++)
           {
              char ch1= s.charAt(i);
              if (ch1 != ' ')
               word = word +ch1;
               else 
               {StringBuffer sb = new StringBuffer(word);
                System.out.print (sb.reverse() + " ");
                word="";
                }  
        } 
            }
        }
    