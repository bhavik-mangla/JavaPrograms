import java.util.Scanner;
class pat1
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    double y=-1;
    double sum=0;
    for (int i = 1;i<=10;i++)
    {
        sum+=2;
        sum=sum*y;}
        System.out.println("SUM = "+sum);
    }
}