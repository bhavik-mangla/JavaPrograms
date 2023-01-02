import java.util.Scanner;
class CpSp
{
   public static void main (String args[])
   {
       Scanner in = new Scanner(System.in);
       double cp,sp,p,l,pP,lP;
       System.out.println("Enter the cost price :-");
       cp= in.nextDouble();
       System.out.println("Enter the selling price :-");
       sp= in.nextDouble();
       p= sp-cp;
       l= cp-sp;
       pP= (p/cp)*100.0;
       lP= (l/cp)*100.0;
       if (cp >sp) System.out.println("Loss = "+ l + "\n"  +"Loss Percentage = "+ lP);
       else if (cp < sp ) System.out.println("Profit = "+ p + "\n"  + "Profit Percentage = "+ pP);
       else  System.out.println("No Profit, No Loss");
           
    }
}
       