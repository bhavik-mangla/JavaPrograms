import java.util.Scanner;
class Q6_2018
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
           String s=in.nextLine();
           s=s +" ";
           String  word="";      
           for (int i=0;i<s.length();i++)
           {
              char ch1= s.charAt(i);
              if (ch1 != ' ')
               word = word +ch1;
               else 
               {char ch=Character.toUpperCase(word.charAt(0));
                   System.out.print(ch +word.substring(1) +" ");word="";
                }
                
            }
        }
    }