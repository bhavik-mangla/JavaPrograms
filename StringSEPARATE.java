import java.util.Scanner;
class StringSEPARATE
{ 
    public static void main(String args[])
    { 
        Scanner in = new Scanner(System.in);
           System.out.println("Enter a sentence.");
          String s=in.nextLine();
          s=s +" ";
         String word2="", word1="";
         String max = "";
         int max1=0; int n =s.lastIndexOf("?");                     
          word1= s.substring(0,n+1);
           word2= s.substring(n+1);
         System.out.println("Questions : "+ word1);
         System.out.println("Answers : "+ word2);}
        }
      