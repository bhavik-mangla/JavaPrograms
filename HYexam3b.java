import java.util.Scanner;
class HYexam3b
  {
     
      public static void main(String args[])
          {Scanner in = new Scanner(System.in);
              System.out.println("Enter the number(x) :");
              int x = in.nextInt();
              int sum=0;
              for(int i = 1;i<=20;i++)
              {
               if ((i%2)==0)
                {sum+= (Math.pow(x,i)*-1);
            }
                else 
                {sum+= (Math.pow(x,i)); 
            }
            }
            System.out.println("Sum(S) = "+sum);
        } 
    }