import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
           Scanner in = new Scanner(System.in); 
           System.out.println("Enter the number");
           int n= in.nextInt();
           int sum = 0;
           for ( int i = 1; i<n;i++)
           { if (n%i==0)
               sum=sum+i;
           }
           if (sum==n)
           System.out.println("Perfect number");
           else
           System.out.println("Not a Perfect number");
    }
}