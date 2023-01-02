import java.util.Scanner;
class HYexam5
  {
     
      public static void main(String args[])
      {Scanner in = new Scanner(System.in);
       System.out.println("Enter Number of units :-");
       int num=in.nextInt();
       double amt, surcrg;
       double initialAmt;
       if (num <= 100) {amt=num*2.00;}
       else if (num <=300 ) {
               amt=200+(num-100)*3.00;
           }
              else  {
                  initialAmt=800+((num-300)*5.00);
                  surcrg = initialAmt*0.025;
                  amt=initialAmt+surcrg;
                }
              System.out.println("Amount = "+amt);
   }
  }
       
