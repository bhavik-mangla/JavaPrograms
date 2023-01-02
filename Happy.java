import java.util.*;
public class Happy
{
    static int digits(String d)
    {
        int nod=d.length();
        return nod;
    }
    static int sumDigits(int n1)
    {
        int sum1=0;
        while(n1>0)

        {
            int a =n1%10;
            sum1 = sum1+(a*a);
            n1=n1/10;
        }
return sum1;
    }
    public static void main(String args [])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        String ns = String.valueOf(n);
      int sum =0;
      int digits;
      digits = Happy.digits(ns);
         while(digits>1 )

         {
             
              sum = Happy.sumDigits(n);
              System.out.println(sum);
             ns=String.valueOf(sum);
             n=sum;
             digits=Happy.digits(ns);
             
            }
            if(sum==1)

            {
                System.out.println("It's a happy number");
            }
            else
            System.out.println("It's not a happy number");
        }}

