import java.util.Scanner;
 class Q9_2018
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int N = in.nextInt();
        String name[] = new String[N];
        int totalmarks[]=new int[N];
        int sum =0, avg=0;
        System.out.println("Enter names of students:-");
        in.nextLine();
        for(int i=0;i<N;i++)
        {
            name[i]=in.nextLine();
        }
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter marks of "+name[i]);
            totalmarks[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
         sum= sum + totalmarks[i];
        }
        avg= sum/N;
        System.out.println("Average = "+avg);
        int dev=0;
        for(int i=0;i<N;i++)
        {
            dev=totalmarks[i] - avg;
            System.out.println("Deviation of "+name[i]+ " = " + dev);
        }
    }
}

