import java.util.Scanner;
class pan_name
{   public static void main (String args[])
       { Scanner in =new Scanner (System.in);
           double inc,a,b,c,d,e,f;
           int pan;
           String name;
           System.out.println("Enter your Name");
           name=in.nextLine();
            System.out.println("Enter your Pan number");
           pan=in.nextInt();
           System.out.println("Enter your Income");
           inc=in.nextDouble();
           a = 10.0/100*inc;
           b = 5000 +(20.0/100*inc);
           c = 25000 +(30.0/100*inc);
           d= inc + a;
           e= inc + b;
           f= inc + c;
           System.out.println("Pan \t Name \t Taxable-Income(Rupees) \t Tax");
           if (inc<= 100000)
           System.out.println(pan +"\t"+ name +"\t"+ inc +"\t\t" + "0");
           else if (inc>=100001 && inc<= 150000)
           System.out.println(pan +"\t"+ name +"\t"+ d +"\t\t"+ a);
           else if (inc>=150001 && inc<= 250000)
           System.out.println(pan +"\t"+ name +"\t"+ e +"\t\t"+ b);
           else if(inc>=250001)
           System.out.println(pan + "\t"+name +"\t"+ f +"\t\t"+ c);
           else
           System.out.println("Invalid income"+ name);
        }
    }
           
