import java.util.Scanner;
class oddEven
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the n number");
           int n= in.nextInt();
           int even=0;
           int odd =0;
           for ( int i = 1; i<=n;i++)
           {
              System.out.println("Enter the numbers :");
              int num=in.nextInt();
              if (num%2==0)
              {even=even+num;
                }
                else
              {odd=odd+num;
                }
           }
           System.out.println("Sum of even numbers : "+even +"\n" + "Sum of odd numbers"+odd); 
    }
}
