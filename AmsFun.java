import java.util.Scanner;
class AmsFun
{
    int num;
    public void input()
    {
          Scanner in =new Scanner(System.in);
          System.out.println("Enter the number :-");
          num=in.nextInt(); 
    }
     public void Amstrong()
    {
              int w ;int t=num;int sum=0;
              while(num>0)
               {w=num%10;
                   sum+=(w*w*w);
                   num=num/10;
            }
                if (sum==t)
                {System.out.println("It's an armstrong number..");
                }
                else System.out.println("It's not an armstrong number..");
        } 
    public static void main (String args[])
      { 
         AmsFun obj = new AmsFun();
        obj.input();
        obj.Amstrong();
        }
    }

    