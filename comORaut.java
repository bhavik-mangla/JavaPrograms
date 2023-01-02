import java.util.Scanner;
 class comORaut
{
    public static void main (String args[])
    
    {   Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int num = in.nextInt();
        int sq = num*num;
        int counter=0;
        int t = num;
        for(int i = num;num>0;num=num/10)
        {counter++;}
        int lastdgt = sq%(int)Math.pow(10,counter);
        if(t==lastdgt)
        {System.out.println("Autotrophic number");}
        else
        {System.out.println("Composite number");}
    }
}
