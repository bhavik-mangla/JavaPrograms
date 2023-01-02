import java.util.Scanner;
class evenORodd
{
     public static void main(String args[])
        { Scanner in = new Scanner(System.in);
            System.out.println("HELLO! Enter the number to check whether it's odd or even");
            double a ; a= in.nextDouble();
            if (a%2==0){System.out.println("It's an EVEN number since the remainder after dividing it by 2 = 0.");} else System.out.println("It's an odd number since the remainder after dividing it by 2 = 1.");
        }
    }
        