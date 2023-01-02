import java.util.Scanner;
import java.util.*;
class noOFwords
{ public static void main(String args[])
    {   
     Scanner in = new Scanner (System.in);
     System.out.println("Enter a sentence : ");
     String s=in.nextLine();
     StringTokenizer str = new StringTokenizer(s," .,?!");           
     int n = str.countTokens();
     System.out.println("Number of words in the sentence = " +n);
    }
}