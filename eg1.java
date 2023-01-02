 import java.util.Scanner;
 class eg1
{

public static void main(String args[])
     { 
        Scanner in = new Scanner(System.in);
        int x ;
        x = in.nextInt();
        double y = 100, z = 0.15; 
        System.out.println("Hours Worked = "+ x);
                  System.out.println("Payment Amount = "+ (x * y) );
                           System.out.println("Tax Payayble = "+ (x * y * z));
                           System.out.println("Amount to be paid = "+ (x * y * z + x * y));
                        }
                    }