import java.util.Scanner;
class AreaOfCir
     { public static void main (String args[])
    {
        int x; 
        double  y;
        
         Scanner in = new Scanner(System.in);
         System.out.println("Enter radius:-");
        x = in.nextInt();
       y = 3.14;
      System.out.println("Area = "+(y*x*x));  
    }
} 