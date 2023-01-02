//Q : A simple calculator program by using Switch Case...
import java.util.Scanner;
class switchCase2 
{ public static void main (String args[])
      {   System.out.println("Welcome to Bhavik's special calculator");
        double x, y; int z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        x = in.nextDouble();
               System.out.println("Enter 2nd number");
        y = in.nextDouble();
               System.out.println("Enter 1 for addition. \n 2 for  subtraction.\n 3 for multiplication. ");
               System.out.println(" 4 for division. \n 5 for square root of 1st number.");
               System.out.println(" 6 for square root of 2nd number \n 7 to exit.");
        z = in.nextInt();  
        switch (z){
        case 1 : System.out.println("Result    =     "+ (x + y));
        case 2 : System.out.println("Result    =     "+ (x - y));
        case 3 : System.out.println("Result    =     "+ (x * y));
        case 4 : System.out.println("Result    =     "+ (x / y));
        case 5 : System.out.println("Result    =     "+ (Math.sqrt(x)));
        case 6 : System.out.println("Result    =     "+ (Math.sqrt(y))); 
        case 7 : System.exit(0);
        } 
    } 
}

