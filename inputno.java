import java.util.Scanner;
class inputno
{
    public static void main (String args[])
    
  {  Scanner in = new Scanner(System.in);
      int a; String b;
      System.out.println("Enter your name : ");
      b= in.nextLine();
      System.out.println("Enter your age : ");
      a= in.nextInt();
      if (a>=18) { System.out.println(b + " ,Good! YOU ARE ELIGIBLE TO VOTE ");} else { System.out.println(b+" ,Have Patience...YOU ARE NOT ELIGIBLE TO VOTE");} 
    }
}  