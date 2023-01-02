import java.util.Scanner;
class buzz
{
    public static void main(String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("The number should have it's last digit=7");
           System.out.println("Or it should be comletely divisible by 7");
           System.out.println("ENTER THE NUMBER");
           double a = in.nextDouble();
          
           if ( a%10==7 || a%7==0)
           {System.out.println("It's a buzz number");}
           else {System.out.println("It's not a buzz number...");}
        
    }
}