import java.util.Scanner;
class ArmstrongNo
  {
     
      public static void main(String args[])
          {Scanner in = new Scanner(System.in);
              System.out.println("Enter the number :");
              int n = in.nextInt();
              int w ;int t=n;int sum=0;
              while(n>0)
               {w=n%10;
                   sum+=(w*w*w);
                   n=n/10;
            }
                if (sum==t)
                {System.out.println("It's an armstrong number..");
                }
                else System.out.println("It's not an armstrong number..");
        } 
    }