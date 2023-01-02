import java.util.Scanner;
class PairsCons
 {
     public static void main (String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          s=s+" ";
          s=s.replace(".","");
         String  word="";
         int count=0; 
         System.out.print("Consecutive Words are ");
          for (int i=0;i<s.length();i++)
           {
              char ch= s.charAt(i);
              if (ch != ' ')
               word = word +ch;
               else
               {for (int j=0;j<word.length()-1;j++)
                {  int ch1 = (int)word.charAt(j);
                    int ch2 = (int)word.charAt(j+1);
                    if(ch2==ch1+1)
                    {count+=1;
                        System.out.println(word+" ");
                    }
                 
                }  
                word="";
             }
            }
            
        }
    }
    