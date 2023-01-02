import java.util.Scanner;
class HYexam4
  {
     
      public static void main(String args[])
          {Scanner in = new Scanner(System.in);
              System.out.println("Enter the number :");
              int num = in.nextInt();
              int temp=num ;int sum=0;int dig;
              for(int i = 1; i<=num;num/=10)//252
               {dig=num%10;//2
                   sum=(sum*10)+dig;
                }
            
               if (sum==temp)
                {System.out.println("It's a palindrome number..");
                }
                else System.out.println("It's not a palindrome number..");
        } 
    }