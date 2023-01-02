import java.util.Scanner;
class Fibonacci
   {public static void main(String args[])
       {Scanner in = new Scanner(System.in);
         System.out.println("enter the number:");
           int n=in.nextInt();
           int n1=0;
           int n2=1;int n3;
           System.out.print(n1+" "+n2+" ");//0 1
           int i=1;
           while (i<=n)
           {
               n3 = n2 + n1;//n3=1;n3=3;n3=5......
               System.out.print(n3+" ");// 1 3 5 .......
               n1=n2;//n1=1;n1=1;n1=2
               n2=n3;//n2=1;n2=2;n2=3......
               i++;
            }
        }
    }