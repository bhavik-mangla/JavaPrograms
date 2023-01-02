import java.util.Scanner;
 class strikeRate
  {public static void main (String args[])
      {Scanner in = new Scanner (System.in);
          double a, b;
          System.out.println("Enter total runs scored :-");
          a = in.nextDouble();
           System.out.println("Enter total balls faced :-");
          b = in.nextDouble();
          System.out.println("Runs scored : "+a);
          System.out.println("Balls faced : "+b);
          System.out.println("Strike Rate : "+((100*a)/b));
        }
    }
          
          
          