import java.util.Scanner;
class ISBN
{
    public static void main(String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the ISBN Number:");
           String a = in.nextLine();int sum=0;
           long b =Long.parseLong(a);
           System.out.println(a.length());
           for(int i=10;i>0;i--)
           {   double n = b%10;
               sum=sum+(int)(n*i);
               b=b/10;
               System.out.println(sum + "    " + n);
            }
           if (a.length()==10&&(sum%11==0))
           {System.out.println("The number is ISBN" + "\nSum= "+sum);}
           else {System.out.println("It's not an ISBN number...");}
        
    }
}