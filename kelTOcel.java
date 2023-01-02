import java.util.Scanner;
class kelTOcel
  {public static void main (String args[])
      {double x,y;
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the value which you want to convert into celsius or farhenite:-");
          x = in.nextDouble();
          System.out.println("Press 1 if you want to convert the value to celsius and 2 to convert the value to farhenite:- ");
          y= in.nextDouble();
          if (y==1) {System.out.println("Result = " + ((x-32)*5/9)+ " Celsius");}
          if (y==2) {System.out.println("Result = " + ((x*5/9+32))+ " Farhenite");} 
    }
}
          