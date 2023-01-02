import java.util.Scanner;
class LongestWord
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          s=s +" ";
         String s1="", word="";
         String max = "";
         int max1=0;                      
           for (int i=0;i<s.length();i++)
           {
              char ch1= s.charAt(i);
              if (ch1 != ' ')
               word = word +ch1;
               else if (word.length()>max1)
               {max = word;
                max1=word.length();
                word="";
                }  
              
        } 
             System.out.println ("The longest Word = " +max);
             System.out.println("Word's length = " + max1);
            }
        }
    