import java.util.Scanner;
class prime2{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the number");
           int n= in.nextInt();
           boolean flag=true;
           for ( int i = 2; i<n;i++)
           { if (n%i==0)
               flag=false;
           }
           if (flag==true)
           System.out.println("Prime number");
           else
           System.out.println("Not a Prime number");
    }
}