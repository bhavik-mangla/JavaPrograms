import java.util.Scanner;
class switchCase
 { 
   public static void main(String args[])
      { 
        Scanner in = new Scanner (System.in);
        double p,k;
        int inp;
        System.out.println("Enter the number(p)");
        p=in.nextDouble();
        System.out.println("Enter the power(k)");
        k=in.nextDouble();
        System.out.println("Enter 1 for natural logarithms\n     2 for absolute value\n     3 for power of the number");
        inp=in.nextInt();
        switch(inp)
        {case 1 : System.out.println("Natural logarithm value of the number(p) = " + Math.log(p));
            break;
         case 2 : System.out.println("Absolute value of the number(p) = " + Math.abs(p));
         break;
         case 3 : System.out.println("Power of number(p) raised to power(k)  = " + Math.pow(p,k));
         break;
         default : System.out.println("Please enter the correct number.");
         break;
        }
    }
}

        
        
  