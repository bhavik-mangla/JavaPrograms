import java.util.Scanner;
class pat2
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    double num,x;
    double y=0;
    double sum=4;
    System.out.println("Enter the n terms");
    num = in.nextInt();
    for (int i = 1;i<=num;i++)
    {x=1/sum;
        y+=x;
        sum+=4;}
        System.out.println("SUM = "+y);
    }
}