import java.util.Scanner;
class StringFrequency
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          System.out.println ("Enter the word to be searched : ");
          String s1=in.nextLine();
          s=s +" ";int count = 0;
        String  word=""; boolean flag= false;              
           for (int i=0;i<s.length();i++)
           {
              char ch1= s.charAt(i);
              if (ch1 != ' ')
               word = word +ch1;
               else 
               {
                   if (word.compareTo(s1)==0)
                   {
                       flag=true;
                       count =count+1;
                  }
                  word="";
                }  
        } 
             if (flag== true)
             System.out.println("The searched word occurs " + count + " times.");
             else 
             System.out.println("The searched word not found.");
            }
        }
    