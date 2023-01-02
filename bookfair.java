import java.util.*;
public class bookfair
    {  
        String Bname;
        double price;
        double price1;  
               double discount=0.0;
    public void input()
    { 
    Scanner in= new Scanner(System.in); 
    System.out.println("Enter the name of the book ");
     Bname = in.nextLine() ;
    System.out.println("Enter the price of the book;");
     price = in.nextDouble();
}
public void calculate()
{
     
    if(price <= 1000){discount = 0.02 *  price;}
    else if (price > 1000 && price <= 3000){discount = 0.1*price;}
    else {discount = 0.15*price;}
    price1 = price - discount;
}
public void display()
{
     System.out.println("Name of the book is :" + Bname);
      System.out.println("Price of the book is  :" + price1);
    }
    public static void main (String args[])
    {
       bookfair obj = new bookfair();
       obj.input();
       obj.calculate();
       obj.display();
    }
}
    
    